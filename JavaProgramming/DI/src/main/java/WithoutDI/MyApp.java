package WithoutDI;

public class MyApp {

    private EmailService email = new EmailService();

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        email.sendEmail(msg, rec);
    }
}
