package abstractFactoryDp.buttons;

public class MacOsButton implements IButton {

    @Override
    public void paint() {
        System.out.println("You have created a MacOs Button.");
    }
}
