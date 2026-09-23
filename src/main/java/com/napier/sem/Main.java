package com.napier.sem;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        System.out.println("Connecting to database...");

        db.connect();

        db.disconnect();
    }
}