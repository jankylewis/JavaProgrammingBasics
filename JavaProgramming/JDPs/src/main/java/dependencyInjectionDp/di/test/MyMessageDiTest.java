package dependencyInjectionDp.di.test;

import dependencyInjectionDp.di.consumers.IConsumer;
import dependencyInjectionDp.di.injectors.EmailServiceInjector;
import dependencyInjectionDp.di.injectors.IMessageServiceInjector;
import dependencyInjectionDp.di.injectors.SmsServiceInjector;

public class MyMessageDiTest {

    public static void main(String[] args) {

        String msg = "Say hi to the camera";
        String email = "highinfluencer@gmail.com";
        String sms = "1148738273";

        IMessageServiceInjector iMessageServiceInjector;

        IConsumer myApp;

        //Sending email
        iMessageServiceInjector = new EmailServiceInjector();
        myApp = iMessageServiceInjector.getConsumer();
        myApp.processMessages(msg, email);

        //Sending sms
        iMessageServiceInjector = new SmsServiceInjector();
        myApp = iMessageServiceInjector.getConsumer();
        myApp.processMessages(msg, sms);
    }
}
