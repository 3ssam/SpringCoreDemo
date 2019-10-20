package mo.essam.models;

import mo.essam.interfaces.MobileProcessor;
import org.springframework.stereotype.Component;

@Component
public class SnabDragon implements MobileProcessor {

    public void Process() {
        System.out.println("Best Performance");
    }

}
