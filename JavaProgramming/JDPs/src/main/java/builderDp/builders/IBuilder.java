package builderDp.builders;

import builderDp.cars.ECarType;
import builderDp.components.Engine;
import builderDp.components.GpsNavigator;
import builderDp.components.ETransmission;
import builderDp.components.TripComputer;

public interface IBuilder {

    void setCarType(ECarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(ETransmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GpsNavigator gpsNavigator);
}