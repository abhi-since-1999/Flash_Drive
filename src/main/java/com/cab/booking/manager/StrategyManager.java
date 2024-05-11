package com.cab.booking.manager;

import com.cab.booking.entities.TripMetaData;
import com.cab.booking.strategy.DefaultPricingStrategy;
import com.cab.booking.strategy.DriverMatchingStrategy;
import com.cab.booking.strategy.LeastTimeDriverMatchingStrategy;
import com.cab.booking.strategy.PricingStrategy;

public class StrategyManager{

    private static StrategyManager strategyManagerInstance;
    private StrategyManager(){};

    public static StrategyManager getStrategyMgrInstance(){
        if(strategyManagerInstance == null){
            strategyManagerInstance = new StrategyManager();
        }
        return strategyManagerInstance;
    }

    public PricingStrategy determinePricingStrategy(TripMetaData tripMetaData){
        return new DefaultPricingStrategy();
    }

    public DriverMatchingStrategy determineDriverMatchingStrategy(TripMetaData tripMetaData){
        return new LeastTimeDriverMatchingStrategy();
    }


}
