package ChainResponsibility;

public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("account_ban".equals(issue) || "data_loss".equals(issue)) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}