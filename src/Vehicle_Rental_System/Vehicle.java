package Vehicle_Rental_System;

public class Vehicle {
    String manufacturer;
    String model;
    int year;
    double baseRentalPrice;
    int rentalDays;

    public Vehicle(){}
    public Vehicle(String manufacturer,String model,int year,double baseRentalPrice, int rentalDays) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.baseRentalPrice = baseRentalPrice;
        this.rentalDays = rentalDays;
    }

    public double calculateRentalCost() {
        System.out.println("Rental Details:");
        double total;
        double discount = 0.0;
        if (rentalDays >= 30) {
            discount = (baseRentalPrice*rentalDays) * 0.2;
            total = (baseRentalPrice * rentalDays) - discount;
        } else {
            total = baseRentalPrice * rentalDays;
        }
        System.out.println("Discount : $"+discount);
        return total;
    }

}

