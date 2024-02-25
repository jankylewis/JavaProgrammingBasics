package dependencyInjectionDp.di.services;

public class EmailServiceImplementation implements IMessageService {

    @Override
    public void sendMessages(String msg, String rec) {

        System.out.println("Email sent to " + rec + " with message: " + msg);
    }
}
