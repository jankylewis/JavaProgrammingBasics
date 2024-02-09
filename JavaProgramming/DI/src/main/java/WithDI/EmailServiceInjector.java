package WithDI;

public class EmailServiceInjector implements IMessageServiceInjector {

    @Override
    public IConsumer getConsumer() {

        return new MyDIApp(new EmailServiceImplementation());
    }
}
