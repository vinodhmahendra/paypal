package paypal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "paypal.repository,paypal.services")
@Import({DevConfig.class,ProdConfig.class})
public class ApplicationConfig {

}
