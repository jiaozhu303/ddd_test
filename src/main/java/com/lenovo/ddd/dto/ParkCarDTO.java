package com.lenovo.ddd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhaodj5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkCarDTO {

    private Boolean parkSuccess;

    private Ticket ticket;
}
