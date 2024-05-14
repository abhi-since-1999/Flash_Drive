package com.cab.booking.manager;

import com.cab.booking.entities.TripMetaData;
import com.cab.booking.strategy.DefaultPricingStrategy;
import com.cab.booking.strategy.DriverMatchingStrategy;
import com.cab.booking.strategy.LeastTimeDriverMatchingStrategy;
import com.cab.booking.strategy.PricingStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyManagerTest {
    @Test
    public void testDeterminePricingStrategy() {
        StrategyManager strategyManager = StrategyManager.getStrategyMgrInstance();
        TripMetaData tripMetaData = new TripMetaData(5,5,"Haridwar", "Rhishikesh");
        PricingStrategy pricingStrategy = strategyManager.determinePricingStrategy(tripMetaData);
        assertEquals(DefaultPricingStrategy.class, pricingStrategy.getClass());
    }

    @Test
    public void testDetermineDriverMatchingStrategy() {
        StrategyManager strategyManager = StrategyManager.getStrategyMgrInstance();
        DriverMatchingStrategy driverMatchingStrategy = strategyManager.determineDriverMatchingStrategy();
        assertEquals(LeastTimeDriverMatchingStrategy.class, driverMatchingStrategy.getClass());
    }

    @Test
    public void testSingletonInstance() {
        StrategyManager strategyManager1 = StrategyManager.getStrategyMgrInstance();
        StrategyManager strategyManager2 = StrategyManager.getStrategyMgrInstance();
        assertEquals(strategyManager1, strategyManager2);
    }

}