/*
 * Author Name: Mohit Saini
 * Date: 31-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.vehicles;

public class VehicleService {
    public static void main ( String[] args ) {
        Bike bike = new Bike ( "Bajaj Pulsar" , 766383 , "sportsBike" );
        Car car = new Car ( "HondaCity" , 426473813 , "Sedan" );
        System.out.println ( "Bike Type is = " + bike.getVehicleType ( ) + "Its Speed is = " + bike.maxSpeed ( bike.getVehicleType ( ) ) );
        System.out.println ( "ManufactureInformation =" + bike.getManufacturerInformation ( ) );
        System.out.println ( "Car Type is =" + car.getVehicleType ( ) + "Its Speed is = " + car.maxSpeed ( car.getVehicleType ( ) ) );
        System.out.println ( "ManufactureInformation =" + car.getManufacturerInformation ( ) );
    
    }
}
