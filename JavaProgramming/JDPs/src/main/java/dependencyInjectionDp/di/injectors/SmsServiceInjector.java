package dependencyInjectionDp.di.injectors;

import dependencyInjectionDp.di.consumers.IConsumer;
import dependencyInjectionDp.di.consumers.MyDiApp;
import dependencyInjectionDp.di.services.SmsServiceImplementation;

public class SmsServiceInjector implements IMessageServiceInjector{

    @Override
    public IConsumer getConsumer() {
        return new MyDiApp(new SmsServiceImplementation());
    }
}
