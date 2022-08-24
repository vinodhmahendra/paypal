package paypal.services;

import java.util.List;

import paypal.model.Todo;
import paypal.repository.TodoRepository;
import paypal.repository.TododRepositoryImpl;

public class TodoServiceImpl implements TodoService
{
	
	private TodoRepository todoRepository = new TododRepositoryImpl();
	

	@Override
	public List<Todo> findAll() {
		return todoRepository.findAll();
	}

	@Override
	public Todo findById(long theId) {
		return todoRepository.findById(theId);
	}

	@Override
	public Todo deleteById(long theId) {
		return todoRepository.deleteById(theId);
	}

	@Override
	public Todo save(Todo theTodo) {
		return todoRepository.save(theTodo);
	}

	
	
}
