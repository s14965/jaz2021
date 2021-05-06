package pl.pjatk.szymaj;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public Pojo pojo() {
        return new Pojo("some value");
    }

    @Bean
    public List<String> defaultData() {
        return List.of("1","2","3","4","5");
    }

    @Bean public List<String> reverseDefaultData() {
        return List.of("5","4","3","2","1");
    }
}
