package com.cab.booking.strategy;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.TripMetaData;
import com.cab.booking.manager.DriverMgr;

import java.util.ArrayList;
import java.util.List;


public class LeastTimeDriverMatchingStrategy implements DriverMatchingStrategy{
    @Override
    public List<String> matchDriver() {
        DriverMgr driverMgr = DriverMgr.getDriverMgrInstance();
        List<String> driverList = new ArrayList<>();
        driverList = driverMgr.getAllDrivers();
        return driverList;
    }
}
