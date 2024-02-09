package abstractFactoryDp.factories;

import abstractFactoryDp.buttons.IButton;
import abstractFactoryDp.buttons.MacOsButton;
import abstractFactoryDp.checkboxes.ICheckbox;
import abstractFactoryDp.checkboxes.MacOsCheckbox;

public class MacOsFactory implements IAbstractFactory {

    @Override
    public IButton createButton() {
        return new MacOsButton();
    }

    @Override
    public ICheckbox createdCheckbox() {
        return new MacOsCheckbox();
    }
}
