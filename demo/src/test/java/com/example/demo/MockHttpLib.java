package com.example.demo;
import com.example.demo.IHttpLib;
import com.example.demo.Response;

public class MockHttpLib implements IHttpLib {

    private int hours;

    public MockHttpLib(int hours) {
        this.hours = hours;
    }

    public Response call(String url) throws Exception {
        String name = url.substring(url.indexOf("=")+1);
        if (hours < 12) {
            return new Response(200, "Good morning " + name);
        } else if (hours < 18) {
            return new Response(200, "Good afternoon " + name);
        } else {
            return new Response(200, "Good evening " + name);
        }
    }

}
