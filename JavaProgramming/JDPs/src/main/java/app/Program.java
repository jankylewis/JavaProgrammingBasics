package app;

import abstractFactoryDp.factories.IAbstractFactory;
import abstractFactoryDp.factories.MacOsFactory;
import abstractFactoryDp.factories.WindowsFactory;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Program {

    @Contract(" -> new")
    private static @NotNull Application prepareProgram() {

        Application app;
        IAbstractFactory iAbstractFactory;
        String osCategory = System.getProperty("os.name").toLowerCase();

        if (osCategory.contains("mac")) {

            iAbstractFactory = new MacOsFactory();
            return new Application(iAbstractFactory);
        }

        iAbstractFactory = new WindowsFactory();
        return new Application(iAbstractFactory);
    }

    public static void main(String[] args){
        prepareProgram()
                .paint();
    }
}
