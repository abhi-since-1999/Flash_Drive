package com.cab.booking.strategy;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.TripMetaData;
import com.cab.booking.manager.DriverMgr;

public class LeastTimeDriverMatchingStrategy implements DriverMatchingStrategy{
    @Override
    public Driver matchDriver(TripMetaData metadata) {
        return DriverMgr.getDriverMgrInstance().getDriver("Shambhu");
    }
}
