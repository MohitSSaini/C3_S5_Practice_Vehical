/*
 * Author Name: Mohit Saini
 * Date: 31-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.vehicles;

public class Bike extends VehicleManufacturer {
    
    @Override
    public String getManufacturerInformation ( ) {
        return null;
    }
    
    public Bike ( ) {
    }
    
    public Bike ( String vehicleName , long vehicleModelName , String vehicleType ) {
        super ( vehicleName , vehicleModelName , vehicleType );
    }
}
