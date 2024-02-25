package builderDp.cars;

import builderDp.components.Engine;
import builderDp.components.GpsNavigator;
import builderDp.components.ETransmission;
import builderDp.components.TripComputer;

public class Car {

    private final ECarType carType;
    private final int seats;
    private final Engine engine;
    private final ETransmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;
    private double fuel = 0;

    public Car(ECarType carType, int seats, Engine engine, ETransmission transmission, TripComputer tripComputer, GpsNavigator gpsNavigator) {

        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;

        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }

        this.gpsNavigator = gpsNavigator;
    }

    public ECarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public ETransmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GpsNavigator gpsNavigator() {
        return gpsNavigator;
    }
}