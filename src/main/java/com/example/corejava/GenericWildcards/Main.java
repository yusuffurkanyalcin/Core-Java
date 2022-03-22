package com.example.corejava.GenericWildcards;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> fenerbahce = Set.of("Caner","Pelkas");
        Set<String> turkiye = Set.of("Burak","Rüştü","Caner");
        Set<String> birlesim = Union.union(fenerbahce,turkiye);

        System.out.println(birlesim);
        System.out.println("*************");

        // can to sum the different Number types
        System.out.println(Union.sum(15,2.2));
    }
}
