package com.cab.booking.entities;

import com.cab.booking.strategy.PricingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Trip {
    private Rider rider;
    private Driver driver;
    private String srcLoc;
    private String dstLoc;
    private int tripID;
    private double price;
    private PricingStrategy pricingStrategy;
}
