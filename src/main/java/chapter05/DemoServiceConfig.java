package chapter05;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DemoServiceConfig {

    @Bean("aa")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DemoServiceConfigure demoServiceConfigure() {
        return new DemoServiceConfigure();
    }
}
