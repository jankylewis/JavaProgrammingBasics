package dependencyInjectionDp.di.injectors;

import dependencyInjectionDp.di.consumers.IConsumer;

public interface IMessageServiceInjector {

    IConsumer getConsumer();
}
