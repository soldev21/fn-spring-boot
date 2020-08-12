package fn.main.util;

import fn.main.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogger {

    static Logger logger = LoggerFactory.getLogger("Nazrin");
    static Logger logger2 = LoggerFactory.getLogger("Fatma");

    public static void info(String msg){
        logger.info(msg);
    }

    public static void info2(String msg){
        logger2.info(msg);
    }
}
