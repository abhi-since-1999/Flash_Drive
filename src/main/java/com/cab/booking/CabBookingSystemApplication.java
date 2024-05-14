package com.cab.booking;

import com.cab.booking.entities.Driver;
import com.cab.booking.entities.Rider;
import com.cab.booking.manager.DriverMgr;
import com.cab.booking.manager.RiderMgr;
import com.cab.booking.manager.TripMgr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CabBookingSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(CabBookingSystemApplication.class,args);

		RiderMgr riderMgr = RiderMgr.getRiderMgrInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rider name: ");
		String riderName = sc.nextLine();
		System.out.println("Enter rider rating: ");
		int riderRating = sc.nextInt();

		System.out.println("Enter source location");
		String src = sc.next();

		System.out.println("Enter destination location");
		String dest = sc.next();

		Rider rider1 = new Rider(riderName, riderRating);
		riderMgr.addRider(riderName, rider1);

		Rider rider2 = new Rider("Ashwin", 5);
		riderMgr.addRider("Ashwin", rider2);

		Driver driver1 = new Driver("Manoj", "Sedan", 5);
		DriverMgr.getDriverMgrInstance().addDriver("Manoj", driver1);

		Driver driver2 = new Driver("Bhaskar", "Mini", 5);
		DriverMgr.getDriverMgrInstance().addDriver("Bhaskar", driver2);

		Driver driver3 = new Driver("Santosh", "SUV", 5);
		DriverMgr.getDriverMgrInstance().addDriver("Santosh", driver3);

		TripMgr.getTripMgrInstance().CreateTrip(rider1, src, dest);
	}

}
