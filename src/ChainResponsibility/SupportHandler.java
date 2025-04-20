package ChainResponsibility;

public abstract class SupportHandler {
    protected SupportHandler next;

    public SupportHandler setNext(SupportHandler handler) {
        if (handler == this) {
            throw new IllegalArgumentException("Handler cannot point to itself!");
        }
        this.next = handler;
        return handler;
    }

    public abstract void handle(String issue);
}
