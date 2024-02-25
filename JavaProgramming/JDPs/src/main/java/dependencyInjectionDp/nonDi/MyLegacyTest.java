package dependencyInjectionDp.nonDi;

public class MyLegacyTest {

    public static void main(String[] args) {

        MyApp myApp = new MyApp();
        myApp.processMessages("Say hi to the camera", "highinfluencer@gmail.com");
    }
}
