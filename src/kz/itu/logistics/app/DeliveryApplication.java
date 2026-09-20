package kz.itu.logistics.app;

import kz.itu.logistics.factory.GUIFactory;
import kz.itu.logistics.logistics.Logistics;
import kz.itu.logistics.ui.Button;
import kz.itu.logistics.ui.Checkbox;

public class DeliveryApplication {
    private final GUIFactory guiFactory;
    private final Logistics logistics;

    // Constructor Injection of Abstract Factories / Contracts
    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }

    public void run(String cargo, String destination) {
        // UI rendering using Abstract Factory
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();

        // Execution of logistics workflow using Factory Method
        logistics.planDelivery(cargo, destination);
    }
}