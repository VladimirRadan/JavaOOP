package utils;

import main.Student;

public class Utils {

    private Utils(){}

    public static String randomEmail(){
        return System.currentTimeMillis() + "@email.com";
    }

}
