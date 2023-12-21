package Vehicle_Rental_System;
public class MotorCycle extends Vehicle{
    boolean isNeedHelmet;
    MotorCycle(String manufacturer,String model,int year,double baseRentalPrice, int rentalDays,boolean isNeedHelmet){
        super(manufacturer,model,year,baseRentalPrice,rentalDays);
        this.isNeedHelmet = isNeedHelmet;
    }

}
