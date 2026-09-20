package kz.itu.logistics.logistics;

import kz.itu.logistics.vehicle.Transport;
import kz.itu.logistics.vehicle.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}