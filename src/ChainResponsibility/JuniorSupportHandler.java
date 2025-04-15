package ChainResponsibility;

public class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("refund_request".equals(issue) || "billing_issue".equals(issue)) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (next != null) {
            System.out.println("[JuniorSupport] Cannot handle, passing to SeniorSupport");
            next.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle and no next handler available");
        }
    }
}