package observablepattern;

public interface Observable {
    void registerObserver(Observer observer, Events event);
    void raiseEvent(Events event, Object payload);
}
