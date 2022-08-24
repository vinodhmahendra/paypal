package paypal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import paypal.repository.TodoRepository;
import paypal.repository.TododRepositoryImpl;
import paypal.services.TodoService;
import paypal.services.TodoServiceImpl;

@Configuration
public class ApplicationConfig {
	

//	<!-- configure the repository bean-->
//    <bean id="todoRepository" class="paypal.repository.TododRepositoryImpl"/>
	@Bean
	public TodoRepository todoRepository() {
		TododRepositoryImpl tododRepository = new TododRepositoryImpl();
		return tododRepository;
	}
	
	@Bean 
	public TodoService todoService() {
		TodoServiceImpl todoService = new TodoServiceImpl();
		
		//assembly
		todoService.setTodoRepository(todoRepository());
		
		return todoService;
	}

}
