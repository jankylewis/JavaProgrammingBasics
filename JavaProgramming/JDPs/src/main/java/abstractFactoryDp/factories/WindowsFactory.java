package abstractFactoryDp.factories;

import abstractFactoryDp.buttons.IButton;
import abstractFactoryDp.buttons.WindowsButton;
import abstractFactoryDp.checkboxes.ICheckbox;
import abstractFactoryDp.checkboxes.WindowsCheckbox;

public class WindowsFactory implements IAbstractFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createdCheckbox() {
        return new WindowsCheckbox();
    }
}
