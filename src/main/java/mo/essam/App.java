package mo.essam;

import mo.essam.models.Sumsung;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        Sumsung sumsung = context.getBean(Sumsung.class);
        sumsung.config();
    }
}
