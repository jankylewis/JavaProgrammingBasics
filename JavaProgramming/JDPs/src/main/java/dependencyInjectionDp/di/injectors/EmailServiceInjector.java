package dependencyInjectionDp.di.injectors;

import dependencyInjectionDp.di.consumers.IConsumer;
import dependencyInjectionDp.di.consumers.MyDiApp;
import dependencyInjectionDp.di.services.EmailServiceImplementation;

public class EmailServiceInjector implements IMessageServiceInjector{

    @Override
    public IConsumer getConsumer() {
        return new MyDiApp(new EmailServiceImplementation());
    }
}
