package com.cab.booking.strategy;

import com.cab.booking.entities.TripMetaData;

public class DefaultPricingStrategy implements PricingStrategy {
    public double calculatePrice(TripMetaData metaData){
        return 700;
    }
}
