package paypal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "paypal.repository,paypal.services")
public class ApplicationConfig {
	
}
