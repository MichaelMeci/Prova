package observablepattern;

public class Animal implements Payload {
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

    @Override
    public String getDescription() {
        return this.getRazza().name();
    }

    @Override
    public String getName() {
        return this.getNome();
    }

    public enum Razza {
        ZEBRA,
        GIRAFFA,
        LEONE
    }
}
