package dev.academy.alfio;

public class Lista<T> {

    private final T[] list;

    public Lista(T[] array) {
        this.list = array;
    }

    public T getItem(int pos) {
        if(pos >= list.length)
            return null;

        return this.list[pos];
    }
    
    public void addItem(T o, int pos) {
        if(pos >= list.length)
            return;

        this.list[pos] = o;
    }

}
