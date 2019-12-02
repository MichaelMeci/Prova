package dev.academy.alfio;

import com.sun.org.apache.xpath.internal.operations.String;

public class Main {

    public static void main(String[] args) {

        /* Lista lista = new Lista(10);

        lista.addItem(new Object(), 0);
        lista.addItem("Hello", 1);
        lista.addItem(5, 2);
        lista.addItem(new Animale(""), 3);
        lista.addItem(new Mucca(), 4);
        lista.addItem(new Veicolo(), 5);
        lista.addItem(new Treno(), 6);

        Object o = lista.getItem(4);

        if(o instanceof Mucca) {
            Mucca m = (Mucca) o;
        } *
         */

        Animale[] arr = new Animale[5];
        Lista<Animale> m = new Lista<>(arr);

        m.addItem(new Bassotto("Gustavo"), 0);
        m.addItem(new Animale("Tiziano"), 1);
        m.addItem(new Mucca("Carolina"), 2);

        Animale a = m.getItem(0);

        Veicolo[] v = new Treno[2];

        //WILDCARD
        //BOUND LOWER & UPPER
        //INTERSECTION
        //TYPE ERASURE

        // Box<Veicolo> bV = new Box<Treno>();
        // Box<Box<Mucca>> != Box<Mucca>

        // INFERENZA

        Box<Box<Mucca>> b = new Box<>();
        b.setContent(new Box<>());

        Box<Mucca> b2 = b.getContent();
        b2.setContent(new Mucca(""));

        b.getContent().setContent(new Mucca(""));

        //Raw type
        Box b3 = new Box();


        b3 = b;

        b = b3;

        Box<Treno> bT = new Box<>();
        bT.setContent(new Treno());

        Box<Veicolo> bT2 = new Box<>();
        bT2.setContent(new Treno());

        compare(bT, bT2);

        Animale t = getVal(b2);
    }

    public static <T> void doSomething(T[] p){

    }

    public static <T, E> boolean compare(Box<T> box1, Box<E> box2)  {
        return box1.getContent().equals(box2.getContent());
    }

    public static <T> T getVal(Box<T> box) {
        return box.getContent();
    }

    public static Mucca getValMucca(Box<Mucca> box) {
        return box.getContent();
    }
}
