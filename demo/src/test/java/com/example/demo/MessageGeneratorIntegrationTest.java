package com.example.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageGeneratorIntegrationTest {
    @Test
    public void testGeneratedMessage() throws Exception {
        IHttpLib httpLib = new HttpLib();
        MessageGenerator generator = new MessageGenerator(httpLib);
        String msg = generator.generateMessage("http://localhost:9000/?personName=Amir");
        int hours = LocalDateTime.now().getHour();
        System.out.println("--------------");
        System.out.println(msg);
        System.out.println(hours);
        System.out.println("--------------");
        if (hours < 12) {
            assertEquals("Wrong msg received", "Morning message received: ’Good morning Mark’", msg);
        } else if (hours < 18) {
            assertEquals("Wrong msg received", "Afternoon message received: ’Good afternoon Mark’", msg);
        }
    }
}
