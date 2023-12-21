package Vehicle_Rental_System;

public class RentalSystem{
    RentalSystem(){
        Car car = new Car("Ford","Raptor",2023,30,31,4);
        MotorCycle motorCycle = new MotorCycle("Honda","Honda Dream",2024,7,2,true);

        rentVehicle(car,30);
        rentVehicle(motorCycle,2);
    }

    public void rentVehicle(Vehicle vehicle,int rentDays){
        vehicle.rentalDays= rentDays;
        double rentCost = vehicle.calculateRentalCost();
        System.out.println("Vehicle: " + vehicle.manufacturer + " " + vehicle.model);
        System.out.println("Rental Days: " +vehicle.rentalDays);
        System.out.println("Rental Cost: $" +rentCost);
        System.out.println("-------------------------------");

    }
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();
    }


}
