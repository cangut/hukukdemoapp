package tr.com.can.hukukmicroserviceserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HukukMicroserviceServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HukukMicroserviceServiceRegistryApplication.class, args);
    }

}
