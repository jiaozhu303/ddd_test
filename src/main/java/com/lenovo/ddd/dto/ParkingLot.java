package com.lenovo.ddd.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaodj5
 */
@Data
@NoArgsConstructor
public class ParkingLot {


    private Map<Ticket, Car> location = new HashMap<>(10);


    public Ticket parking(Car car) {
        Ticket ticket = new Ticket();
        location.put(ticket, car);

        return ticket;
    }


    public Car parkUp(Ticket ticket) {
        return null;
    }


}
