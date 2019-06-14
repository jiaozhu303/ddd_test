package com.lenovo.ddd.dto;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author zhaodj5
 */
@Data
@NoArgsConstructor
public class ParkingLot {


    private static Map<Integer, Car> location = Maps.newHashMap();

    static {
        for (int i = 1; i <= 10; i++) {
            location.put(i, null);
        }
    }


    private ParkUpCarDTO parking(Car car) {
        return null;
    }


    private ParkUpCarDTO parkUp(String ticket) {
        return null;
    }

}
