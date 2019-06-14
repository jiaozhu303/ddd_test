package com.lenovo.ddd;

import com.lenovo.ddd.dto.Car;
import com.lenovo.ddd.dto.ParkingLot;
import com.lenovo.ddd.dto.Ticket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DddApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void should_parking_success_and_get_a_ticket_when_park_a_car_given_a_car_and_parking_lot_and_location() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();

        Ticket parking = parkingLot.parking(car);

        Assert.assertNotNull(parking);

    }

    @Test
    public void should_parking_fail_when_park_a_car_given_a_car_and_parking_lot_and_no_location() {

    }

    @Test
    public void should_parking_up_success_when_park_up_a_car_given_a_car_and_parking_lot_and_has_a_valid_ticket() {

    }

    @Test
    public void should_parking_up_fail_when_park_up_a_car_given_a_car_and_parking_lot_and_has_no_ticket() {

    }

    @Test
    public void should_parking_up_fail_when_park_up_a_car_given_a_car_and_parking_lot_and_has_a_invalid_ticket() {

    }


    @Test
    public void should_parking_fail_when_park_up_a_cart_duplication_given_a_car_and_parking_lot_and_has_a_valid_ticket() {

    }

}
