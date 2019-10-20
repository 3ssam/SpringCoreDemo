package mo.essam.models;

import mo.essam.interfaces.MobileProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class Sumsung {

    @Autowired
    private MobileProcessor dragon;


    public void setDragon(MobileProcessor dragon) {
        this.dragon = dragon;
    }

    public void config(){
        System.out.println("7000 EL");
        dragon.Process();
    }
}
