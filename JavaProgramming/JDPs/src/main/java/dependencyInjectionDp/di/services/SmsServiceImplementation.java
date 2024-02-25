package dependencyInjectionDp.di.services;

public class SmsServiceImplementation implements IMessageService {

    @Override
    public void sendMessages(String msg, String rec) {

        System.out.println("SMS sent to " + rec + " with message: " + msg);
    }
}