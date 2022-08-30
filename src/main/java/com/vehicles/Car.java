/*
 * Author Name: Mohit Saini
 * Date: 31-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {
    
    
    /**
     * If the vehicle type is a sports car, return 250, otherwise if the vehicle type is a sedan, return 170, otherwise
     * return 0.
     *
     * @param vehicleType The type of vehicle.
     * @return The max speed of the vehicle.
     */
    public int maxSpeed ( String vehicleType ) {
        if ( vehicleType.equals ( "SportsCar" ) ) {
            return 250;
        } else if ( vehicleType.equals ( "Sedan" ) ) {
            return 170;
        }
        return 0;
    }
    
    // Overriding the method `getManufacturerInformation` of the parent class `VehicleManufacturer`.
    @Override
    public String getManufacturerInformation ( ) {
        return "Car{Manufacturer name: '" + getVehicleName ( ) + "', " + "Model Name: '" + getVehicleModelName ( ) +
                "' ,Type: '" + getVehicleType ( ) + "'}.";
    }
}
