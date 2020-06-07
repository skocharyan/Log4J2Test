package com.example.second;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainSecond {
    private static Logger logSecond = LogManager.getLogger(MainSecond.class);
    public static void main(String[] args) {
        logSecond.info("hello i am printing Info from mainSecond class");
        logSecond.error("hello i am printing error from manSecond class");
        logSecond.debug("hell i am printing debug from mainSecond class ");
        logSecond.fatal("hello i am printing faital from mainSecond class");


    }
}
