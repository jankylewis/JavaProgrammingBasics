package builderDp.builders;

import builderDp.cars.Car;
import builderDp.cars.ECarType;
import builderDp.components.Engine;
import builderDp.components.GpsNavigator;
import builderDp.components.ETransmission;
import builderDp.components.TripComputer;

public class CarBuilder implements IBuilder {

    private ECarType carType;
    private int seats;
    private Engine engine;
    private ETransmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    @Override
    public void setCarType(ECarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(ETransmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGpsNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
