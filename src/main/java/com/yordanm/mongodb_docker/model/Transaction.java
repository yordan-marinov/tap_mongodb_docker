package com.yordanm.mongodb_docker.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {

    private final Double amount;
}
