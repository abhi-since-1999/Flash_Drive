package com.cab.booking.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TripMetaData {
    private int riderRating;
    private int driverRating;
    private String src;
    private String dest;
}
