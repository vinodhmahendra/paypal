package paypal.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
@Configuration
@Profile("prod")
@PropertySource("classpath:dev.properties")
public class ProdConfig {
	

	@Bean
	public String example(@Value("${message}") String message) {
//		return new String(environment.getProperty("message"));
		return new String(message);
	}

}
