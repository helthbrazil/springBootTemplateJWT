package br.com.jwt.twt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class TwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwtApplication.class, args);
	}
	
	@RequestMapping("/home")
	public String hello() {
		return "Hello Hebert";
	}

}
