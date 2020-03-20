package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // it enables service as eureka client
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
