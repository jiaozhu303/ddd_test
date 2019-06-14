package com.lenovo.ddd;

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

    /**
     * gievn：一辆车，一个停车场，有车位
     * when:停车
     * then：停车成功，拿到有效票
     */
    @Test
    public void should_parking_success_and_get_a_ticket_when_park_a_car_given_a_car_and_parking_lot_and_location() {


    }

    /**
     * given：一辆车，一个停车场，无车位
     * when：停车
     * then：停车失败
     */
    @Test
    public void should_parking_fail_when_park_a_car_given_a_car_and_parking_lot_and_no_location() {

    }

    /**
     * gievn：一辆车，一个停车场，一张有效票
     * when:取车
     * then：取车成功
     */
    @Test
    public void should_parking_up_success_when_park_up_a_car_given_a_car_and_parking_lot_and_has_a_valid_ticket() {

    }

    /**
     * given：一辆车，一个停车场，没有票
     * when：取车
     * then：取车失败
     */
    @Test
    public void should_parking_up_fail_when_park_up_a_car_given_a_car_and_parking_lot_and_has_no_ticket() {

    }

    /**
     * given：一辆车，一个停车场，一张无效票
     * when：取车
     * then：取车失败
     */
    @Test
    public void should_parking_up_fail_when_park_up_a_car_given_a_car_and_parking_lot_and_has_a_invalid_ticket() {

    }


    /**
     * given：一辆车，一个停车场，一张有效票
     * when：重复取车
     * then：取车失败
     */
    @Test
    public void should_parking_fail_when_park_up_a_cart_duplication_given_a_car_and_parking_lot_and_has_a_valid_ticket() {

    }

}
