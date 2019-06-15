package com.lenovo.ddd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author zhaodj5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLot {

    private Integer locations = 10;

    public Ticket parking(Car car) {
        if (this.locations == 0) {
            return null;
        }
        Ticket ticket = new Ticket();
        --this.locations;
        return ticket;
    }


    public Car parkUp(Ticket ticket) {
        if (Objects.isNull(ticket) ) {
            return null;
        }
        ++this.locations;
        return new Car();
    }

}
