package top.aceofspades.boot.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.aceofspades.demo.DemoModule;

/**
 * @author duanbt
 **/
@Configuration
@ConditionalOnClass(DemoModule.class)
public class DemoAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(DemoModule.class)
    @ConditionalOnProperty(name = "demo.enabled", havingValue = "true", matchIfMissing = true)
    public DemoModule demoModule() {
        return new DemoModule();
    }
}
