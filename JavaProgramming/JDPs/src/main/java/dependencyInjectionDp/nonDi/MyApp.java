package dependencyInjectionDp.nonDi;

public class MyApp {

    private EmailService emailSv = new EmailService();

    public void processMessages(String msg, String rec) {

        emailSv.sendEmail(msg, rec);
    }
}
