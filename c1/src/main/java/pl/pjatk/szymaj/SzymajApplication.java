package pl.pjatk.szymaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:beans.xml"})
public class SzymajApplication {

    public static void main(String[] args) {

        SpringApplication.run(SzymajApplication.class, args);

    }

}
