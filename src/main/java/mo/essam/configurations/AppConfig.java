package mo.essam.configurations;

import mo.essam.interfaces.MobileProcessor;
import mo.essam.models.SnabDragon;
import mo.essam.models.Sumsung;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Sumsung getSumsung(){
        return new Sumsung();
    }

    @Bean
    public MobileProcessor getSnapdragon(){
        return new SnabDragon();
    }
}
