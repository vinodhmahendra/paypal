package paypal.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import paypal.model.Todo;
import paypal.services.TodoService;

public class TodoApplication {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		TodoService todoService = new TodoServiceImpl();
		
		TodoService todoService = container.getBean("todoService", TodoService.class);
		
		List<Todo> loadedTodos = todoService.findAll();
		
		loadedTodos.forEach(todo -> System.out.println(todo.getDescription()));

	}

}
