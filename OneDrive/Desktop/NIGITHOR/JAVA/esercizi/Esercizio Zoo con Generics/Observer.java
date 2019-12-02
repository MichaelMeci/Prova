package observablepattern;

public interface Observer<T> {
    void onEvent(T event);
}
