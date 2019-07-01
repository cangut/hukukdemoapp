package tr.com.can.hukukmicroservicevekil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HukukMicroserviceVekilApplication {

    public static void main(String[] args) {
        SpringApplication.run(HukukMicroserviceVekilApplication.class, args);
    }

}
