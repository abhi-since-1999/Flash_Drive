package com.cab.booking.entities;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderTest {

    @Test
    public void testRiderName() {
        Rider rider = new Rider("John", 4);
        assertEquals("John", rider.getRiderName());
    }

    @Test
    public void testRiderRating() {
        Rider rider = new Rider("Alice", 3);
        assertEquals(3, rider.getRiderRating());
    }

    @Test
    public void testSetter() {
        Rider rider = new Rider("Bob", 5);
        rider.setRiderName("Charlie");
        rider.setRiderRating(4);
        assertEquals("Charlie", rider.getRiderName());
        assertEquals(4, rider.getRiderRating());
    }
}
