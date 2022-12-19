package com.mongodb.MongoDb.Example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String country;
    private String postCode;
    private String city;
}
