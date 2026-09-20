# Software Design Patterns - Assignment 2: Logistics & Cross-Platform UI

## Project Overview
This Java application demonstrates the integration of two classic creational design patterns:
1. **Factory Method**: Used for instantiating different delivery vehicles (`Truck` or `Ship`) via creator classes (`RoadLogistics` and `SeaLogistics`).
2. **Abstract Factory**: Used for rendering platform-specific UI component families (`Button` and `Checkbox`) for `WINDOWS` and `MACOS`.

## Prerequisites
* Java Development Kit (JDK) 17 or higher.

## Package Structure
```text
kz.itu.logistics
├── app          # Client application logic
├── factory      # Abstract Factory interfaces and concrete implementations
├── logistics    # Factory Method abstract creator and concrete creators
├── ui           # Abstract UI product interfaces and concrete UI products
└── vehicle      # Transport product interface and concrete vehicles