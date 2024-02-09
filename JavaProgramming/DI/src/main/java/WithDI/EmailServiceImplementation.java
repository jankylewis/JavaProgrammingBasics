package WithDI;

public class EmailServiceImplementation implements IMessageService {

    @Override
    public void sendMessage(String msg, String receiver) {

        //logic to send email
        System.out.println("SMS sent to "+receiver+ " with Message="+msg);
    }
}
