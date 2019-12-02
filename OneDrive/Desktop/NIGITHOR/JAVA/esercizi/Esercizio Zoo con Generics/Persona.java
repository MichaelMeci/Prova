package observablepattern;

public class Persona implements Payload {
    private final String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescription() {
        return "Ciao sono "+ nome;
    }

    @Override
    public String getName() {
        return this.getNome();
    }

    public String getNome() {
        return nome;
    }
}
