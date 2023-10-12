package com.acme;

import java.io.File;
import java.io.IOException;

public class App {
    public String get_Greeting() throws IOException {
        File tempDir;
        tempDir = File.createTempFile("", ".");
        tempDir.delete();
        tempDir.mkdir();

        String password="MyPassword";
        String token="y0_0000000000000000000000000000000000000000000000000000000";
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().get_Greeting());
    }
}
