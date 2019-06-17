package com.lenovo.ddd;

import com.lenovo.ddd.dto.Car;
import com.lenovo.ddd.dto.ParkingLot;
import com.lenovo.ddd.dto.Ticket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(MockitoJUnitRunner.class)
public class DddApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void should_parking_success_and_get_a_ticket_when_park_a_car_given_a_car_and_parking_lot_and_location() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertTrue(parkingLot.getLocations() <= 10 && parkingLot.getLocations() > 0);
        Ticket parking = parkingLot.parking(car);
        Assert.assertEquals(9, (int) parkingLot.getLocations());
        Assert.assertNotNull(parking);

    }

    @Test
    public void should_parking_fail_when_park_a_car_given_a_car_and_parking_lot_and_no_location() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(0);
        Ticket parking = parkingLot.parking(car);
        Assert.assertNull(parking);
    }

    @Test
    public void should_parking_up_success_when_park_up_a_car_given_a_car_and_parking_lot_and_has_a_ticket() {
        Ticket ticket = new Ticket();
        ParkingLot parkingLot = new ParkingLot();
        Car car = parkingLot.parkUp(ticket);
        Assert.assertNotNull(car);
    }

    @Test
    public void should_parking_up_fail_when_park_up_a_car_given_a_car_and_parking_lot_and_has_no_ticket() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = parkingLot.parkUp(null);
        Assert.assertNull(car);
    }


}
