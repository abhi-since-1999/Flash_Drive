package com.cab.booking.strategy;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.TripMetaData;

public interface DriverMatchingStrategy {
    public Driver matchDriver(TripMetaData metadata);
}
