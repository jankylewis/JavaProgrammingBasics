package builderDp.builders;

import builderDp.cars.ECarType;
import builderDp.cars.Manual;
import builderDp.components.Engine;
import builderDp.components.GpsNavigator;
import builderDp.components.ETransmission;
import builderDp.components.TripComputer;

public class CarManualBuilder implements IBuilder {

    private ECarType carType;
    private int seats;
    private Engine engine;
    private ETransmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    @Override
    public void setCarType(ECarType _carType) {
        carType = _carType;
    }

    @Override
    public void setSeats(int _seats) {
        seats = _seats;
    }

    @Override
    public void setEngine(Engine _engine) {
        engine = _engine;
    }

    @Override
    public void setTransmission(ETransmission _transmission) {
        transmission = _transmission;
    }

    @Override
    public void setTripComputer(TripComputer _tripComputer) {
        tripComputer = _tripComputer;
    }

    @Override
    public void setGpsNavigator(GpsNavigator _gpsNavigator) {
        gpsNavigator = _gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
