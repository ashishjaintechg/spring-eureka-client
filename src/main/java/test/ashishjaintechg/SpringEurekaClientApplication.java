package test.ashishjaintechg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/client")
@EnableEurekaClient
public class SpringEurekaClientApplication {

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String greetings() {
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientApplication.class, args);
	}

}
