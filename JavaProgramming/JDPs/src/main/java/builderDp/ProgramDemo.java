package builderDp;

import builderDp.builders.CarBuilder;
import builderDp.builders.CarManualBuilder;
import builderDp.cars.Car;
import builderDp.cars.Manual;
import builderDp.director.Director;

public class ProgramDemo {

    public static void main (String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built: \n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual build: \n" + carManual.print());
    }
}
