package com.cab.booking.manager;

import com.cab.booking.entities.Driver;
import lombok.Getter;


import java.util.HashMap;

@Getter
public class DriverMgr {
    private static DriverMgr driverMgrInstance;
    private HashMap<String, Driver> mp = new HashMap<>();

    private DriverMgr(){};

    public static DriverMgr getDriverMgrInstance() {
        if(driverMgrInstance == null){
            driverMgrInstance = new DriverMgr();
        }
        return driverMgrInstance;
    }

    public void addDriver(String pDriverName, Driver pDriver){
        mp.put(pDriverName, pDriver);
    }
    public Driver getDriver(String driverName){
        return mp.get(driverName);
    }
}
