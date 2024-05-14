package com.cab.booking.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripMetaDataTest {
    @Test
    public void testTripMetaDataFields() {
        TripMetaData tripMetaData = new TripMetaData(4, 5, "A", "B");

        assertEquals(4, tripMetaData.getRiderRating());
        assertEquals(5, tripMetaData.getDriverRating());
        assertEquals("A", tripMetaData.getSrc());
        assertEquals("B", tripMetaData.getDest());
    }
}