package builderDp.director;

import builderDp.builders.IBuilder;
import builderDp.cars.ECarType;
import builderDp.components.Engine;
import builderDp.components.ETransmission;
import builderDp.components.GpsNavigator;
import builderDp.components.TripComputer;

public class Director {

    public void constructSportsCar(IBuilder iBuilder) {

        iBuilder.setCarType(ECarType.SPORTS_CAR);
        iBuilder.setSeats(2);
        iBuilder.setEngine(new Engine(3.0, 0));
        iBuilder.setTransmission(ETransmission.SEMI_AUTOMATIC);
        iBuilder.setTripComputer(new TripComputer());
        iBuilder.setGpsNavigator(new GpsNavigator());
    }

    public void constructCityCar(IBuilder iBuilder) {

        iBuilder.setCarType(ECarType.CITY_CAR);
        iBuilder.setSeats(2);
        iBuilder.setEngine(new Engine(1.2, 0));
        iBuilder.setTransmission(ETransmission.AUTOMATIC);
        iBuilder.setTripComputer(new TripComputer());
        iBuilder.setGpsNavigator(new GpsNavigator());
    }

    public void constructSuv(IBuilder iBuilder) {

        iBuilder.setCarType(ECarType.SUV);
        iBuilder.setSeats(4);
        iBuilder.setEngine(new Engine(2.5, 0));
        iBuilder.setTransmission(ETransmission.MANUAL);
        iBuilder.setGpsNavigator(new GpsNavigator());
    }
}
