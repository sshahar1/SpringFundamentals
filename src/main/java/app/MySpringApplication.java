package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sigals on 26/09/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }

    @Bean(name = "rivki")
    public String myString() {
        return "Sigal";
    }
}
