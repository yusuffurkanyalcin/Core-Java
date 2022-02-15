package com.example.corejava.StaticFactory;

public class CustomerFactory {

    public static Customer createWithDefaultCategory(
            String firstName,
            String lastName,
            String country
    ){
        return new Customer(firstName,lastName,country,"Bireysel");
    }

    public static Customer createWithoutDefault(
            String firstName,
            String lastName,
            String country,
            String category
    ){
                return new Customer(firstName,lastName,country,category);
    }
}
