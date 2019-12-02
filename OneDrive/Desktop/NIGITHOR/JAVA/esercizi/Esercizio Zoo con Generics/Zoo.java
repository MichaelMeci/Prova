package observablepattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo implements Observable<Event<Payload>> {
    private final Map<Events, List<Observer<Event<Payload>>>> observers = new HashMap<>();

    @Override
    public void registerObserver(Observer<Event<Payload>> observer, Events event) {
        if(this.observers.containsKey(event)) {
            this.observers.get(event).add(observer);
        } else {
            List<Observer<Event<Payload>>> newObserversList = new ArrayList<>();
            newObserversList.add(observer);
            this.observers.put(event, newObserversList);
        }
    }

    @Override
    public void raiseEvent(Event<Payload> event) {
        List<Observer<Event<Payload>>> eventObserver = this.observers.get(event.getEventName());
        if(eventObserver == null || eventObserver.size() == 0)
            return;

        for (Observer<Event<Payload>> observer : eventObserver) {
            observer.onEvent(event);
        }
    }

    public void addAnimal(Animal animal) {
        Event<Payload> event = new Event<>(Events.NEW_ANIMAL, animal);
        this.raiseEvent(event);
    }

    public void vendiBiglietto(Persona persona) {
        Event<Payload> event = new Event<>(Events.NUOVO_VISITATORE, persona);
        this.raiseEvent(event);
    }

}
