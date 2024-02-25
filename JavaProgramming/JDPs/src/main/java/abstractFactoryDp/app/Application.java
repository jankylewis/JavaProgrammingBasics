package abstractFactoryDp.app;

import abstractFactoryDp.buttons.IButton;
import abstractFactoryDp.checkboxes.ICheckbox;
import abstractFactoryDp.factories.IAbstractFactory;
import org.jetbrains.annotations.NotNull;

public class Application {

    private IButton iButton;
    private ICheckbox iCheckbox;

    public Application(@NotNull IAbstractFactory iAbstractFactory) {

        iButton = iAbstractFactory.createButton();
        iCheckbox = iAbstractFactory.createdCheckbox();
    }

    public void paint(){

        iButton.paint();
        iCheckbox.paint();
    }
}
