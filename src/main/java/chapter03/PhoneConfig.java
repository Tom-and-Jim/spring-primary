package chapter03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneConfig {

    @Bean
    public Charger charger() {
        return new Charger();
    }

    @Bean
    public Phone phone(Charger charger) {
        return new Phone(charger);
    }
}
