package com.lenovo.ddd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class ParkingLotFactoryTest {

    /**
     * given: 一辆车，一个小弟，多个停车厂未满
     * when:停车
     * then:小弟可以把车按照顺序停到停车场，获取一张票
     */

    /**
     * given: 一辆车，一个小弟，多个停车厂已满
     * when:停车
     * then:小弟停车失败，获取不到停车票
     */

    /**
     * given: 一张车票，一个小弟，在多个停车场中其中一个停过车
     * when:取车
     * then:小弟可以正确的找到车，并取出来，
     */

    /**
     * given: 一张车票，一个小弟，在多个停车场中未停过车
     * when:取车
     * then:小弟取车失败
     */

    @Test
    public void should_I_not_know_how_do_it_now() {
        assertTrue(true);
    }
}
