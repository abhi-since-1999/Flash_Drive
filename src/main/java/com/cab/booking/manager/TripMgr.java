package com.cab.booking.manager;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.Rider;
import com.cab.booking.entities.Trip;
import com.cab.booking.entities.TripMetaData;
import com.cab.booking.strategy.DriverMatchingStrategy;
import com.cab.booking.strategy.PricingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TripMgr {
    private static TripMgr tripMgrInstance;
    RiderMgr riderMgrInstance;
    DriverMgr driverMgrInstance;
    List<String> driverList;
    private TripMgr(){};

    public static TripMgr getTripMgrInstance(){
        if(tripMgrInstance == null){
            tripMgrInstance = new TripMgr();
        }
        return tripMgrInstance;
    }

    public void CreateTrip(Rider rider, String src, String dest){

        DriverMatchingStrategy driverMatchingStrategy = StrategyManager.getStrategyMgrInstance().determineDriverMatchingStrategy();
        driverList = driverMatchingStrategy.matchDriver();

        System.out.println("Available drivers: " + driverList);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the  driver by name: ");
        String selectedDriver = sc.nextLine();
        Driver driver1 = DriverMgr.getDriverMgrInstance().getDriver(selectedDriver);

        while(driver1 == null){
            System.out.println("Driver not in the list, choose again");
            selectedDriver = sc.nextLine();
            driver1 = DriverMgr.getDriverMgrInstance().getDriver(selectedDriver);
        }

        TripMetaData tripMetaData = new TripMetaData(rider.getRiderRating(), driver1.getDriverRating(), src, dest);


        PricingStrategy pricingStrategy = StrategyManager.getStrategyMgrInstance().determinePricingStrategy(tripMetaData);
        double price = pricingStrategy.calculatePrice(tripMetaData);

        Trip trip = new Trip(rider, driver1, src, dest, 7, price,pricingStrategy);
        System.out.println("trip is from : " + trip.getSrcLoc() + " to " + trip.getDstLoc());
        System.out.println("Driver is : " + trip.getDriver().getDriverName());
        System.out.println("Rider is : " + trip.getRider().getRiderName());
        System.out.println("Fare is : " + trip.getPrice());
    }
}
