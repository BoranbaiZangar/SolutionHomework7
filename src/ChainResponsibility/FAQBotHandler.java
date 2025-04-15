package ChainResponsibility;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("password_reset".equals(issue)) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (next != null) {
            System.out.println("[FAQBot] Cannot handle, passing to JuniorSupport");
            next.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle and no next handler available");
        }
    }
}