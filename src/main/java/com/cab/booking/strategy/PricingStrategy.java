package com.cab.booking.strategy;

import com.cab.booking.entities.TripMetaData;

public interface PricingStrategy {
    double calculatePrice(TripMetaData pTripMetaData);
}
