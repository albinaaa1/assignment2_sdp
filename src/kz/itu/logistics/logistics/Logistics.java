package kz.itu.logistics.logistics;

import kz.itu.logistics.vehicle.Transport;

public abstract class Logistics {

    // Factory Method
    public abstract Transport createTransport();

    // Shared workflow method
    public void planDelivery(String cargo, String destination) {
        Transport transport = createTransport();
        transport.deliver(cargo, destination);
    }
}