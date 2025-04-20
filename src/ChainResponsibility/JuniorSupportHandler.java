package ChainResponsibility;

import java.util.Set;

public class JuniorSupportHandler extends SupportHandler {
    private static final Set<String> SUPPORTED_ISSUES = Set.of("refund_request", "billing_issue");

    @Override
    public void handle(String issue) {
        if (SUPPORTED_ISSUES.contains(issue)) {
            System.out.println("[" + getClass().getSimpleName() + "] Handled: " + issue);
        } else if (next != null) {
            System.out.println("[" + getClass().getSimpleName() + "] Cannot handle '" + issue + "', passing to next...");
            next.handle(issue);
        } else {
            System.out.println("[" + getClass().getSimpleName() + "] Cannot handle '" + issue + "' and no next handler.");
        }
    }
}
