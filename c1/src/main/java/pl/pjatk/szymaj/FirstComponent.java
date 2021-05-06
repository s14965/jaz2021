package pl.pjatk.szymaj;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class FirstComponent {

    public FirstComponent(
            SecondComponent secondComponent,
            Pojo pojo,
            List<String> defaultData,
            List<String> reverseDefaultData,
            @Value("${my.custom.property}") String propertiesValue,                       //l2c2
            @Value("${my.own.random:some default value}") String defaultProperValue, //l2c3
            @Value("${my.custom.property}") String secondProperValue
    ) {
        System.out.println("HF FirstComponent");
        pojo.outString();
        System.out.println(defaultData);
        System.out.println(reverseDefaultData);
        System.out.println(propertiesValue);
        System.out.println(pojo.getsField());
    }

    public void printMessage() {
        System.out.println("HF FirstComponent from method printMessage");
    }
}
