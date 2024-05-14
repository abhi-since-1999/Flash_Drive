package com.cab.booking.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class DriverTest {

    @Test
    public void testDriverFields() {
        Driver driver = new Driver("John", "SUV", 4);

        assertEquals("John", driver.getDriverName());
        assertEquals("SUV", driver.getVehicleType());
        assertEquals(4, driver.getDriverRating());
    }
}