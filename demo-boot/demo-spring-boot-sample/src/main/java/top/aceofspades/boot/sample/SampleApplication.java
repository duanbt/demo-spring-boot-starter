package top.aceofspades.boot.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.aceofspades.demo.DemoModule;

/**
 * @author duanbt
 **/
@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    private static final Logger logger = LoggerFactory.getLogger(SampleApplication.class);

    @Autowired
    private DemoModule demoModule;

    @Bean
    ApplicationRunner runner() {
        return args -> {
            String hello = demoModule.hello("hello");
            logger.info("Call DemoModule.hello(): {}", hello);
        };
    }
}
