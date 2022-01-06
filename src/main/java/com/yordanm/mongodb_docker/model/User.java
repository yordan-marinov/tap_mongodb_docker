package com.yordanm.mongodb_docker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private final String id;

    private final String firstName;
    private final String lastName;
    private List<Address> addresses;
    private List<Transaction> transactions;
}
