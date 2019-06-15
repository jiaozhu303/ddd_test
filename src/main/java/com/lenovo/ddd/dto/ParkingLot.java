package com.lenovo.ddd.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhaodj5
 */
@Data
@NoArgsConstructor
public class ParkingLot {

    private Integer locations = 10;

    public Ticket parking(Car car) {
        Ticket ticket = new Ticket();
        --this.locations;

        return ticket;
    }


    public Car parkUp(Ticket ticket) {
        return null;
    }

}
