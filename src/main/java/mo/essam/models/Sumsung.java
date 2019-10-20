package mo.essam.models;

import mo.essam.interfaces.MobileProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //its name of Component is "sumsung"
//you can change it when using qualify instead of autowired that is search bu name not datatype
public class Sumsung {

    @Autowired
    @Qualifier("exoz")
    private MobileProcessor dragon;

    public void setDragon(MobileProcessor dragon) {
        this.dragon = dragon;
    }

    public void config(){
        System.out.println("7000 EL");
        dragon.Process();
    }
}
