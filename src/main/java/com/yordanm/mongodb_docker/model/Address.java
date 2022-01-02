package com.yordanm.mongodb_docker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {


    private final String streetName;
    private final int houseNumber;
    private final String city;
}
