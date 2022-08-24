package paypal.client;

import java.util.List;

import paypal.model.Todo;
import paypal.services.TodoService;
import paypal.services.TodoServiceImpl;

public class TodoApplication {

	public static void main(String[] args) {
		
		TodoService todoService = new TodoServiceImpl();
		
		List<Todo> loadedTodos = todoService.findAll();
		
		loadedTodos.forEach(todo -> System.out.println(todo.getDescription()));

	}

}
