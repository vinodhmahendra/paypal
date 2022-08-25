package paypal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AspectConfig.class)
@ComponentScan(basePackages = "paypal.repository,paypal.services")
public class ApplicationConfig {
	
}
