package observablepattern;

// POJO Plain Old Java Object
public final class Event<P> {
    private final Events eventName;
    private final P eventPayload;

    public Event(Events eventName, P eventPayload) {
        this.eventName = eventName;
        this.eventPayload = eventPayload;
    }

    public Events getEventName() {
        return eventName;
    }

    public P getEventPayload() {
        return eventPayload;
    }
}
