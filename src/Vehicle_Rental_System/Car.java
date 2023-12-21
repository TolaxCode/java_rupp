package Vehicle_Rental_System;

public class Car extends Vehicle{
    int numberOfSeats;
    Car(String manufacturer,String model,int year,double baseRentalPrice, int rentalDays,int numberOfSeats){
        super(manufacturer,model,year,baseRentalPrice,rentalDays);
        this.numberOfSeats = numberOfSeats;
    }
}
