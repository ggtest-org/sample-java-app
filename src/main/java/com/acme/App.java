package com.acme;

import java.io.File;
import java.io.IOException;

public class App {
    public String get_Greeting() {
        File tempDir;
        tempDir = File.createTempFile("", ".");
        tempDir.delete();
        tempDir.mkdir();

        String password="MyPassword";
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().get_Greeting());
    }
}
