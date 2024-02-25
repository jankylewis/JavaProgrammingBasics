package builderDp;

public class CarManualBuilder implements Builder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    @Override
    public void setCarType(CarType _carType) {
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
    public void setTransmission(Transmission _transmission) {
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
}
