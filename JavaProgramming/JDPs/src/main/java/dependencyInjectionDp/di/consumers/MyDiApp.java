package dependencyInjectionDp.di.consumers;

import dependencyInjectionDp.di.services.IMessageService;

public class MyDiApp implements IConsumer {      //This is a Consumer app

    private IMessageService iMessageService;

    public MyDiApp(IMessageService _iMessageService) {
        iMessageService = _iMessageService;
    }

    @Override
    public void processMessages(String msg, String rec) {
        iMessageService.sendMessages(msg, rec);
    }
}
