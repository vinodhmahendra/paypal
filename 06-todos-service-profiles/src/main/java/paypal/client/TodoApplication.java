package paypal.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import paypal.config.ApplicationConfig;
import paypal.model.Todo;
import paypal.services.TodoService;

public class TodoApplication {

	public static void main(String[] args) {
		

		System.setProperty("spring.profiles.active","dev");
		
		ApplicationContext container = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		TodoService todoService = new TodoServiceImpl();
		
		TodoService todoService = container.getBean("todoService", TodoService.class);
		
		List<Todo> loadedTodos = todoService.findAll();
		
		loadedTodos.forEach(todo -> System.out.println(todo.getDescription()));
		
		
		System.out.println("Read From Environment : " + container.getBean("example"));

	}

}
