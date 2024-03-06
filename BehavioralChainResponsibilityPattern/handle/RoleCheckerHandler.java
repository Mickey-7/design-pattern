package BehavioralChainResponsibilityPattern.handle;

public class RoleCheckerHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page...");
        return handleNext(username, password);
    }
}
