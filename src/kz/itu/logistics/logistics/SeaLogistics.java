package kz.itu.logistics.logistics;

import kz.itu.logistics.vehicle.Ship;
import kz.itu.logistics.vehicle.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}