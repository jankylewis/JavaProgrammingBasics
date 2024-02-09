package WithDI;

public class SMSServiceImplementation implements IMessageService{

    @Override
    public void sendMessage(String msg, String receiver) {

        //logic to send SMS
        System.out.println("SMS sent to "+receiver+ " with Message="+msg);
    }
}
