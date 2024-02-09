package abstractFactoryDp.checkboxes;

import abstractFactoryDp.checkboxes.ICheckbox;

public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("You have created a Windows Checkbox.     ");
    }
}
