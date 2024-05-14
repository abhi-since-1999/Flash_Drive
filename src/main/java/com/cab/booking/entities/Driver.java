package com.cab.booking.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Driver {
    private String driverName;
    private String vehicleType;
    private int driverRating;

}
