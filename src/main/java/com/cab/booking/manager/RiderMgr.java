package com.cab.booking.manager;

import com.cab.booking.entities.Rider;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class RiderMgr {
    private static RiderMgr riderMgrInstance;
    private HashMap<String, Rider> riderHashMap;

    private RiderMgr(){};  //to make it a singleton class

    public static RiderMgr getRiderMgrInstance(){
        if(riderMgrInstance == null){
            riderMgrInstance = new RiderMgr();
        }
        return riderMgrInstance;
    }

    public void addRider(String name, Rider rider){
        riderHashMap = new HashMap<>();
        riderHashMap.put(name, rider);
    }
}
