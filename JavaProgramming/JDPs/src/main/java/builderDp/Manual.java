package builderDp;

public class Manual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;

    public Manual(CarType carType,
                  int seats,
                  Engine engine,
                  Transmission transmission,
                  TripComputer tripComputer,
                  GpsNavigator gpsNavigator) {

        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {

        String infor = "";

        infor += "Type of car: " + carType + "\n";
        infor += "Count of seats: " + seats + "\n";
        infor += "Engine: volume - " + engine.getVolume() +
                "; mileage - " + engine.getMileage() + "\n";

        infor += "Transmission: " + transmission + "\n";

        if (this.tripComputer != null) {
            infor += "Trip Computer: Functional" + "\n";
        } else {
            infor += "Trip Computer: N/A" + "\n";
        }

        if (this.gpsNavigator != null) {
            infor += "GPS Navigator: Functional" + "\n";
        } else {
            infor += "GPS Navigator: N/A" + "\n";
        }

        return infor;
    }
}
