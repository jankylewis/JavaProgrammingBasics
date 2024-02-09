package abstractFactoryDp.checkboxes;

import abstractFactoryDp.checkboxes.ICheckbox;

public class MacOsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("You have created a Mac Os Checkbox.  ");
    }
}
