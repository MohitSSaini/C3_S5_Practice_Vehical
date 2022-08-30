/*
 * Author Name: Mohit Saini
 * Date: 31-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.vehicles;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private long vehicleModelName;
    private String vehicleType;
    
    public VehicleManufacturer ( ) {
    }
    
    public VehicleManufacturer ( String vehicleName , long vehicleModelName , String vehicleType ) {
        this.vehicleName = vehicleName;
        this.vehicleModelName = vehicleModelName;
        this.vehicleType = vehicleType;
    }
}
