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
    
    public String getVehicleName ( ) {
        return vehicleName;
    }
    
    public void setVehicleName ( String vehicleName ) {
        this.vehicleName = vehicleName;
    }
    
    public long getVehicleModelName ( ) {
        return vehicleModelName;
    }
    
    public void setVehicleModelName ( long vehicleModelName ) {
        this.vehicleModelName = vehicleModelName;
    }
    
    public String getVehicleType ( ) {
        return vehicleType;
    }
    
    public void setVehicleType ( String vehicleType ) {
        this.vehicleType = vehicleType;
    }
}
