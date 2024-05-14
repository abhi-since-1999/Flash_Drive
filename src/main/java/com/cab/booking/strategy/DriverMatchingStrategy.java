package com.cab.booking.strategy;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.TripMetaData;

import java.util.List;

public interface DriverMatchingStrategy {
    public List<String> matchDriver();
}
