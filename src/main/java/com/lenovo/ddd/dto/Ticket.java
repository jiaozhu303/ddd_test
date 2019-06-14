package com.lenovo.ddd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zhaodj5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    private Long carNumber;
    private Long validTime;
    private Date parkingTime;

    public boolean isValidTicket() {
        Date currentDate = new Date();
        return (currentDate.getTime() - (this.parkingTime.getTime() + validTime)) > 0;
    }

}
