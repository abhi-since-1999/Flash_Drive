package com.cab.booking;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.Rider;
import com.cab.booking.manager.DriverMgr;
import com.cab.booking.manager.RiderMgr;
import com.cab.booking.manager.TripMgr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class CabBookingSystemApplication {

	public static void main(String[] args) {
		Rider rider1 = new Rider("Abhishek", 5);
		Driver driver2 = new Driver("Shambhu", true, 5);
		DriverMgr.getDriverMgrInstance().addDriver("Shambhu", driver2);
		TripMgr.getTripMgrInstance().CreateTrip(rider1, "RhishiKesh", "Haridwar");
	}

}
