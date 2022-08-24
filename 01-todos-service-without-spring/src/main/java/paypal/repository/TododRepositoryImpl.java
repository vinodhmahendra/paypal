package paypal.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import paypal.model.Todo;

public class TododRepositoryImpl implements TodoRepository{
	
	private static List<Todo> todos = new ArrayList();
	private static int counter = 0;
	
	
	static {
		todos.add(new Todo(counter++, "vinodh", "Learn to dance", new Date(), false));
		todos.add(new Todo(counter++, "vinodh", "Learn to sing", new Date(), false));
		todos.add(new Todo(counter++, "vinodh", "Learn to paint", new Date(), false));
	}

	@Override
	public List<Todo> findAll() {
		return todos;
	}

	@Override
	public Todo findById(long theId) {
		for ( Todo eachElement : todos) {
			if ( eachElement.getId() == theId) {
				return eachElement;
			}
		}
		return null;
	}

	@Override
	public Todo save(Todo theTodo) {
		if ( theTodo.getId() == -1 || theTodo.getId() == 0) {
			theTodo.setId(++counter);
			todos.add(theTodo);
		}else {
			deleteById(theTodo.getId());
			todos.add(theTodo);
		}
		return theTodo;
	}

	@Override
	public Todo deleteById(long theId) {
		Todo theTodo = findById(theId);
		
		if ( theTodo == null ) {
			return null;
		}
		
		if ( todos.remove(theTodo)) {
			return theTodo;
		}
		return null;
	}

}
