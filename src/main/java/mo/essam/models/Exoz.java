package mo.essam.models;

import mo.essam.interfaces.MobileProcessor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Exoz implements MobileProcessor {

    public void Process() {
        System.out.println("The Cheapest");
    }
}
