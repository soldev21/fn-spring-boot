package fn.main.util;

import fn.main.controller.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogger {

    static Logger logger = LoggerFactory.getLogger(MyLogger.class);

    public static void info(String msg){
        logger.info(msg);
    }
}
