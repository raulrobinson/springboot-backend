package com.rasysbox.ws.utils;

import org.springframework.stereotype.Component;

@Component
public class Utilities {

    public static long latency(long startTime, long stopTime) {
        return stopTime - startTime;
    }

}
