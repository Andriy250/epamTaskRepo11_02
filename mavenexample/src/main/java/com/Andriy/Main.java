package com.Andriy;

import org.apache.logging.log4j.*;

public class Main {

    static private Logger logger1 = LogManager.getLogger(Main.class);

    static public void main (String ... args){


        logger1.trace("trace message");
        logger1.debug("debug message");
        logger1.info("info message");
        logger1.warn("warn message");
        logger1.error("error message");
        logger1.fatal("fatal message");

    }
}
