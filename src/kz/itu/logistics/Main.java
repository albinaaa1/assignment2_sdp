package kz.itu.logistics;

import kz.itu.logistics.app.DeliveryApplication;
import kz.itu.logistics.factory.GUIFactory;
import kz.itu.logistics.factory.MacOSFactory;
import kz.itu.logistics.factory.WindowsFactory;
import kz.itu.logistics.logistics.Logistics;
import kz.itu.logistics.logistics.RoadLogistics;
import kz.itu.logistics.logistics.SeaLogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String modeInput = null;
        String platformInput = null;

        // Parse arguments or fallback to Scanner input
        if (args.length >= 2) {
            modeInput = args[0];
            platformInput = args[1];
        } else if (args.length == 1) {
            System.err.println("Error: Missing parameters. Expected both delivery mode and platform.");
            System.err.println("Usage: java Main <ROAD|SEA> <WINDOWS|MACOS>");
            return;
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter delivery mode (ROAD / SEA): ");
            if (scanner.hasNextLine()) {
                modeInput = scanner.nextLine().trim();
            }
            System.out.print("Enter UI platform (WINDOWS / MACOS): ");
            if (scanner.hasNextLine()) {
                platformInput = scanner.nextLine().trim();
            }
        }

        // Validate missing inputs
        if (modeInput == null || modeInput.isBlank() || platformInput == null || platformInput.isBlank()) {
            System.err.println("Error: Input arguments cannot be empty.");
            return;
        }

        // Resolve Logistics Creator
        Logistics logistics;
        switch (modeInput.toUpperCase()) {
            case "ROAD":
                logistics = new RoadLogistics();
                break;
            case "SEA":
                logistics = new SeaLogistics();
                break;
            default:
                System.err.println("Error: Unsupported delivery mode '" + modeInput + "'. Allowed values: ROAD, SEA.");
                return;
        }

        // Resolve GUI Factory
        GUIFactory guiFactory;
        switch (platformInput.toUpperCase()) {
            case "WINDOWS":
                guiFactory = new WindowsFactory();
                break;
            case "MACOS":
                guiFactory = new MacOSFactory();
                break;
            default:
                System.err.println("Error: Unsupported platform '" + platformInput + "'. Allowed values: WINDOWS, MACOS.");
                return;
        }

        // Output selected settings
        System.out.println("Delivery mode: " + modeInput.toUpperCase());
        System.out.println("UI platform: " + platformInput.toUpperCase());

        // Initialize and execute Client Application
        DeliveryApplication app = new DeliveryApplication(guiFactory, logistics);
        app.run("laboratory equipment", "Aktau warehouse");
    }
}