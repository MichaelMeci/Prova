package observablepattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo implements Observable {
    private final Map<Events, List<Observer>> observers = new HashMap<>();

    @Override
    public void registerObserver(Observer observer, Events event) {
        if(this.observers.containsKey(event)) {
            this.observers.get(event).add(observer);
        } else {
            List<Observer> newObserversList = new ArrayList<>();
            newObserversList.add(observer);
            this.observers.put(event, newObserversList);
        }
    }

    @Override
    public void raiseEvent(Events event, Object payload) {
        List<Observer> eventObserver = this.observers.get(event);
        if(eventObserver == null || eventObserver.size() == 0)
            return;

        Event eventData = new Event(event, payload);

        for (Observer observer : eventObserver) {
            observer.onEvent(eventData);
        }
    }

    public void addAnimal(Animal animal) {
        this.raiseEvent(Events.NEW_ANIMAL, animal);
    }

    public void vendiBiglietto(Persona persona) {
        this.raiseEvent(Events.NUOVO_VISITATORE, persona);
    }

}
