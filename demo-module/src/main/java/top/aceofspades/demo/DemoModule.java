package top.aceofspades.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author duanbt
 **/
public class DemoModule {

    private static final Logger logger = LoggerFactory.getLogger(DemoModule.class);

    public DemoModule() {
        logger.info("Demo Module Initializing");
    }

    public String hello(String hello) {
        return hello;
    }
}
