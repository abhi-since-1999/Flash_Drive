package com.cab.booking.manager;

import com.cab.booking.entities.Rider;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
public class RiderMgr {
    private static RiderMgr riderMgrInstance;
    private HashMap<String, Rider> riderHashMap;

    private RiderMgr(){};  //to make it a singleton class

    private static RiderMgr getRiderMgrInstance(){
        if(riderMgrInstance == null){
            riderMgrInstance = new RiderMgr();
        }
        return riderMgrInstance;
    }

    private void addRider(String name, Rider rider){
        riderHashMap.put(name, rider);
    }
}
