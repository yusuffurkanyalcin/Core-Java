package com.example.corejava.StaticFactory;

public class Main {
    public static void main(String[] args) {

        Customer customer1 =
                CustomerFactory.createWithDefaultCategory(
                "Furkan","Yalçın","Elazığ"
                );

        System.out.println(customer1.getCategory());

        System.out.println("--------------------------");

        Customer customer2 =
                CustomerFactory.createWithoutDefault(
                        "Ali","Miraç","Elazığ","Tüzel"
                );

        System.out.println(customer2.getCategory());
    }
}
