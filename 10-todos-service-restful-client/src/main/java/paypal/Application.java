package paypal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import paypal.model.Todo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		String uri  = "http://localhost:8080/users/{username}/todos";
		
		RestTemplate restTemplate = new RestTemplate();
		
		Todo[] todos =
				restTemplate.getForObject(uri, Todo[].class, "vinodh");
		
		for ( Todo theTodo : todos) {
			System.out.println(theTodo.getDescription());
		}
		
		
	}

}
