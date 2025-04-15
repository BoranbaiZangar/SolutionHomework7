package ChainResponsibility;

public abstract class SupportHandler {
    protected SupportHandler next;

    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler; // позволяет цепочку строить через .setNext().setNext()
    }

    public abstract void handle(String issue);
}
