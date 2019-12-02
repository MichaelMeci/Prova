package observablepattern;

// POJO Plain Old Java Object
public final class Event {
    private final Events eventName;
    private final Object eventPayload;

    public Event(Events eventName, Object eventPayload) {
        this.eventName = eventName;
        this.eventPayload = eventPayload;
    }

    public Events getEventName() {
        return eventName;
    }

    public Object getEventPayload() {
        return eventPayload;
    }
}
