package ru.borichev.alex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrontService {
	public static void main(String[] args) {
		SpringApplication.run(FrontService.class, args);
	}
}

