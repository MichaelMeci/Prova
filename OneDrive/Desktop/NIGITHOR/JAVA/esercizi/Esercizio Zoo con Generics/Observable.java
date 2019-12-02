package observablepattern;

public interface Observable<T> {
    void registerObserver(Observer<T> observer, Events event);
    void raiseEvent(T event);
}
