package com.cab.booking.manager;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.Rider;
import com.cab.booking.entities.Trip;
import com.cab.booking.entities.TripMetaData;
import com.cab.booking.strategy.DriverMatchingStrategy;
import com.cab.booking.strategy.PricingStrategy;

public class TripMgr {
    private static TripMgr tripMgrInstance;
    RiderMgr riderMgrInstance;
    DriverMgr driverMgrInstance;
    private TripMgr(){};

    public static TripMgr getTripMgrInstance(){
        if(tripMgrInstance == null){
            tripMgrInstance = new TripMgr();
        }
        return tripMgrInstance;
    }

    public void CreateTrip(Rider rider, String src, String dest){
        Rider rider1 = new Rider("Abhishek", 5);
        Driver driver1 = new Driver("Shambhu", true, 5);
        TripMetaData tripMetaData = new TripMetaData(rider.getRiderRating(), driver1.getDriverRating(), src, dest);
        DriverMatchingStrategy driverMatchingStrategy = StrategyManager.getStrategyMgrInstance().determineDriverMatchingStrategy(tripMetaData);
        Driver assignedDriver = driverMatchingStrategy.matchDriver(tripMetaData);

        PricingStrategy pricingStrategy = StrategyManager.getStrategyMgrInstance().determinePricingStrategy(tripMetaData);
        double price = pricingStrategy.calculatePrice(tripMetaData);

        Trip trip = new Trip(rider1, assignedDriver, src, dest, 7, price,pricingStrategy);
        System.out.println("trip is from : " + trip.getSrcLoc() + " to " + trip.getDstLoc());
        System.out.println("Driver is : " + trip.getDriver().getDriverName());
        System.out.println("Rider is : " + trip.getRider().getRiderName());
        System.out.println("Fare is : " + trip.getPrice());
    }
}
