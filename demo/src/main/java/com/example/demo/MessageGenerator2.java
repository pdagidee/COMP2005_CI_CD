package com.example.demo;

public class MessageGenerator2 {

    public static String messageGenerator2 (int hours) {
         String message;
        if (hours < 9) {
            message = "Good morning";
        } else if (hours < 18) {
            message = "Good afternoon";
        } else if (hours < 21) {
            message = "Good evening";
        }
        else {
            message = "No more messages today—try again tomorrow";
        }
        return message + "," + " " + "Daniel!";
    }
}
