/*
 * Author Name: Mohit Saini
 * Date: 31-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.vehicles;

public class Bike extends VehicleManufacturer {
    
    public Bike ( ) {
    }
    
    public Bike ( String vehicleName , long vehicleModelName , String vehicleType ) {
        super ( vehicleName , vehicleModelName , vehicleType );
    }
    
    int maxSpeed ( String vehicleType ) {
        if ( getVehicleType ( ).equals ( "sportsBike" ) ) {
            return 250;
        } else if ( vehicleType.equals ( "cruiser" ) ) {
            return 170;
        }
        return 0;
    }
    
    @Override
    public String getManufacturerInformation ( ) {
        return "Bike{Manufacturer name: '" + getVehicleName ( ) + "', " + "Model Name: '" + getVehicleModelName ( ) +
                "' ,Type: '" + getVehicleType ( ) + "'}.";
    }
}
