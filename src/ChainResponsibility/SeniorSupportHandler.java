package ChainResponsibility;

import java.util.Set;

public class SeniorSupportHandler extends SupportHandler {
    private static final Set<String> SUPPORTED_ISSUES = Set.of("account_ban", "data_loss");

    @Override
    public void handle(String issue) {
        if (SUPPORTED_ISSUES.contains(issue)) {
            System.out.println("[" + getClass().getSimpleName() + "] Handled: " + issue);
        } else {
            System.out.println("[" + getClass().getSimpleName() + "] Cannot handle '" + issue + "' — requires manual escalation.");
        }
    }
}
