package BehavioralChainResponsibilityPattern;

import BehavioralChainResponsibilityPattern.handle.Handler;
import BehavioralChainResponsibilityPattern.handle.RoleCheckerHandler;
import BehavioralChainResponsibilityPattern.handle.UserExistsHandler;
import BehavioralChainResponsibilityPattern.handle.ValidPasswordHandler;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckerHandler());

        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username","password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("username","password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username","admin_password"));

        System.out.println("==========================================");
    }

}

/* Chain Responsibility Pattern
    - transforms particular behaviors into stand-alone objects called handlers
    - behavioral design pattern

    - use this pattern when you encounter the need to
      execute several handlers in particular order
    - allows you to insert, remove or reorder handles dynamically
    - each handler must make either process the request or
      pass it along the chain
    - the client my trigger any handler in the chain no just the first one




*/

/*
    UML Design Pattern - Chain of Responsibility

Client ------------------------------------------> <<interface>> Handler
- request can be sent to any  handlers              + handle(request)       ---> method for handling request
- compose of chain if handlers                              ^
                                                            |
                                                        BaseHandler
                                                    - next: Handler
                                                    + handle(request)       ---> optional class - boilerplate code
                                                            ^                    - common to handlers
                                                            |
                                                            |
                                                    ConcreteHandlers
                                                    + handle(request)       ---> operator methods for processing request





*/
