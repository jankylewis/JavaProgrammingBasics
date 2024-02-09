package abstractFactoryDp.factories;

import abstractFactoryDp.buttons.IButton;
import abstractFactoryDp.checkboxes.ICheckbox;

public interface IAbstractFactory {

    IButton createButton();
    ICheckbox createdCheckbox();
}
