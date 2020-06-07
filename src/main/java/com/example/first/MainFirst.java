package com.example.first;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MainFirst {
    private static Logger logFirst = LogManager.getLogger(MainFirst.class);
    public static void main(String[] args) {
        logFirst.info("hello i am printing Info from mainFirst class");
        logFirst.error("hello i am printing error from mainfirst class");
        logFirst.debug("hell i am printing debug from mainFirst");
        logFirst.fatal("hello i am printing faital from mainFirst");

    }
}
