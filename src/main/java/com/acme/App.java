package com.acme;

public class App {
    public String get_Greeting() {
        String password="MyPassword";
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().get_Greeting());
    }
}
