package com.lenovo.ddd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkUpCarDTO {

    private Boolean parkUpSuccess;

    private Car car;
}
