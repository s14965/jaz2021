package pl.pjatk.szymaj;
import org.springframework.context.ApplicationContext;


public class ThirdComponent {

    public ThirdComponent(ApplicationContext applicationContext){
        FirstComponent fc = applicationContext.getBean(FirstComponent.class);
        SecondComponent sc = applicationContext.getBean(SecondComponent.class);
        fc.printMessage();
        sc.printMessage();
    }


}
