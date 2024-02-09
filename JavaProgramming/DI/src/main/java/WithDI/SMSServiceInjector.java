package WithDI;

public class SMSServiceInjector implements IMessageServiceInjector {

    @Override
    public IConsumer getConsumer() {

        return new MyDIApp(new SMSServiceImplementation());
    }
}
