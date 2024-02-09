package abstractFactoryDp.buttons;

public class WindowsButton implements IButton {

    @Override
    public void paint() {
        System.out.println("You have created a Windows Button.");
    }
}
