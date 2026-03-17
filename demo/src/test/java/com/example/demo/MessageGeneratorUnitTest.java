package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MessageGeneratorUnitTest {
    @Test
    public void testGeneratedMessage() throws Exception {
        IHttpLib httpLib = new MockHttpLib(9);
        MessageGenerator generator = new MessageGenerator(httpLib);
        String msg = generator.generateMessage("http://localhost:9000/?personName=Mark");
        assertEquals("Wrong msg received", "Morning message received: ’Good morning Mark’", msg);
    }

    @Test
    public void testGeneratedMessage2() throws Exception {
        IHttpLib httpLib = new MockHttpLib(14);
        MessageGenerator generator = new MessageGenerator(httpLib);
        String msg = generator.generateMessage("http://localhost:9000/?personName=Mark");
        assertEquals("Wrong msg received", "Afternoon message received: ’Good afternoon Mark’", msg);
    }

    @Test
    public void testGeneratedMessage3() throws Exception {
        IHttpLib httpLib = new MockHttpLib(21);
        MessageGenerator generator = new MessageGenerator(httpLib);
        String msg = generator.generateMessage("http://localhost:9000/?personName=Mark");
        assertEquals("Wrong msg received", "Out of hours message received - look in the morning", msg);
    }

}
