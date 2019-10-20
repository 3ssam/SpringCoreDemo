package mo.essam.configurations;

import mo.essam.models.Sumsung;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public Sumsung getSumsung(){
        return new Sumsung();
    }
}
