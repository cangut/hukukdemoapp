package tr.com.can.hukukmicroserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HukukMicroserviceConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HukukMicroserviceConfigApplication.class, args);
    }

}
