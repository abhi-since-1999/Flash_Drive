package com.cab.booking.manager;

import com.cab.booking.entities.Driver;
import lombok.Getter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
public class DriverMgr {
    private static DriverMgr driverMgrInstance;
    private HashMap<String, Driver> driverHashMap = new HashMap<>();
    private List<String> driverList;

    private DriverMgr(){};

    public static DriverMgr getDriverMgrInstance() {
        if(driverMgrInstance == null){
            driverMgrInstance = new DriverMgr();
        }
        return driverMgrInstance;
    }

    public void addDriver(String pDriverName, Driver pDriver){
        driverHashMap.put(pDriverName, pDriver);
    }

    public Driver getDriver(String driverName) throws NullPointerException{
            return driverHashMap.get(driverName);
    }
    public List<String> getAllDrivers(){
        driverList = new ArrayList<>();
        for(String driver : driverHashMap.keySet()){
            driverList.add(driver);
        }
        return driverList;
    }
    public  Driver chooseDriver(String driverName){
        return driverHashMap.get(driverName);
    }
}
