package com.cab.booking.entities;

import com.cab.booking.strategy.PricingStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {
    @Test
    public void testTripFields() {
        Rider rider = new Rider("John", 4);
        Driver driver = new Driver("Alice", "Sedan", 5);
        PricingStrategy pricingStrategy = new MockPricingStrategy();
        Trip trip = new Trip(rider, driver, "A", "B", 1, 10.0, pricingStrategy);

        assertEquals("John", trip.getRider().getRiderName());
        assertEquals("Alice", trip.getDriver().getDriverName());
        assertEquals("A", trip.getSrcLoc());
        assertEquals("B", trip.getDstLoc());
        assertEquals(1, trip.getTripID());
        assertEquals(10.0, trip.getPrice(), 0.01);
        assertEquals(pricingStrategy, trip.getPricingStrategy());
    }

    // Mock PricingStrategy for testing
    static class MockPricingStrategy implements PricingStrategy {
        @Override
        public double calculatePrice(TripMetaData pTripMetaData) {
            return 0;
        }
    }
}