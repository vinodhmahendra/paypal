package paypal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "paypal.repository,paypal.services")
@PropertySource("classpath:app.properties")
public class ApplicationConfig {

	private Environment environment;

	@Autowired
	public ApplicationConfig(Environment environment) {
		System.out.println("container injected environment");
		this.environment = environment;
	}
	
	
	@Bean
	public String example(@Value("${message}") String message) {
//		return new String(environment.getProperty("message"));
		return new String(message);
	}

}
