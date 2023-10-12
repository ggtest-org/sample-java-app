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
        String token="t1.AA=.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000=";
        String token2="AQVN000000000000000000000000000000000000";
        String tokenSlack="xoxa-123456789012-12345678901-123456789012-1234567890asdfghjklz1234567890as";
        String tokenBB="NzA30TAzMTcw0DAy0uQcU3jR0JpMm5LU9NCd53HKzEg3";
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().get_Greeting());
    }
}
