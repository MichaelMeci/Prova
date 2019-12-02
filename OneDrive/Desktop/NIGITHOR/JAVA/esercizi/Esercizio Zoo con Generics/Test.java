package observablepattern;


import java.util.Random;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Zoo zoo = new Zoo();

        Observer<Event<Payload>> observer = new Observer<Event<Payload>>() {
            @Override
            public void onEvent(Event<Payload> event) {
                Events tipoEvento = event.getEventName();

                switch (tipoEvento) {
                    case NEW_ANIMAL:
                        System.out.println("Nuovo animale nello zoo: " + event.getEventPayload().getName());
                        break;
                    case NUOVO_VISITATORE:
                        System.out.println("Nuovo visitatore nello zoo: " + event.getEventPayload().getName());
                        break;
                }
            }

        };

        zoo.registerObserver(observer, Events.NEW_ANIMAL);
        zoo.registerObserver(observer, Events.NUOVO_VISITATORE);

        Random r = new Random();

        int maxRunTime = 5 * 60 * 1000;
        int totRunTime = 0;
        int sleepTime = 1000;

        while (true) {

            int rndmInt = r.nextInt(3);

            if (rndmInt == 0) {
                System.out.println("Non è successo nulla");
                continue;
            } else if (rndmInt == 1) {
                Animal newAnimal = new Animal("Genoveffa", Animal.Razza.GIRAFFA);
                zoo.addAnimal(newAnimal);
            } else if (rndmInt == 2) {
                Persona p = new Persona("Osvaldo");
                zoo.vendiBiglietto(p);
            }

            Thread.sleep(sleepTime);
            totRunTime += sleepTime;
            if(totRunTime >= maxRunTime)
                break;
        }
    }
}
