package observablepattern;

public class Animal {
    private final String nome;
    private final Razza razza;

    public Animal(String nome, Razza razza) {
        this.nome = nome;
        this.razza = razza;
    }

    public String getNome() {
        return nome;
    }

    public Razza getRazza() {
        return razza;
    }

    public enum Razza {
        ZEBRA,
        GIRAFFA,
        LEONE
    }
}
