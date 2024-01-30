package org.example;

public class Main {
    public static void main(String args[]){
        String name = "Hexlet";
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
