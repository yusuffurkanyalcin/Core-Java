package com.example.corejava.StaticFactory;

import lombok.Data;

@Data
public class Customer {

    String firstName;
    String lastName;
    String country;
    String category;

    public Customer(
            String firstName,
            String lastName,
            String country,
            String category
    ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.country=country;
        this.category=category;
    }


}
