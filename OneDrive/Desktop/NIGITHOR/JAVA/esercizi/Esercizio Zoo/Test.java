package observablepattern;


import java.util.Random;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Zoo zoo = new Zoo();

        Observer observer = new Observer() {
            @Override
            public void onEvent(Event event) {
                Events tipoEvento = event.getEventName();

                switch (tipoEvento) {
                    case NEW_ANIMAL:
                        System.out.println("Nuovo animale nello zoo: " + ((Animal) event.getEventPayload()).getNome());
                        break;
                    case NUOVO_VISITATORE:
                        System.out.println("Nuovo visitatore nello zoo");
                        break;
                }

            }
        };

        zoo.registerObserver(observer, Events.NEW_ANIMAL);
        zoo.registerObserver(observer, Events.NUOVO_VISITATORE);

        Random r = new Random();

        while (true) {

            int rndmInt = r.nextInt(3);

            if (rndmInt == 0) {
                continue;
            } else if (rndmInt == 1) {
                Animal newAnimal = new Animal("Genoveffa", Animal.Razza.GIRAFFA);
                zoo.addAnimal(newAnimal);
            } else if (rndmInt == 2) {
                Persona p = new Persona();
                zoo.vendiBiglietto(p);
            }

            Thread.sleep(1000);
        }


    }

}
