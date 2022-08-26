package paypal.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {
	
	//HTTP Request Method: GET
	// URI : '/'
	@GetMapping(path = "/")
	public String getMessage() {
		return "Hello World! Spring Boot!!!";
	}

}
