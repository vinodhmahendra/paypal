package paypal.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import paypal.model.Todo;
import paypal.services.TodoService;

@RestController
public class TodoResource {

	@Autowired
	private TodoService todoService;
	
//	@DeleteMapping(path = "/users/{username}/todos/{id}")
//	public ResponseEntity<Todo> deleteTodo(@PathVariable String username,@PathVariable long id){
//		Todo theTodo = todoService.deleteById(id);
//		return ResponseEntity.notFound().build()
//	}
	
	@PutMapping(path = "/users/{username}/todos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updatesTodo(@PathVariable String username,@RequestBody Todo theTodo){
		//implement the update method ... assignment
	}
	
	
	@DeleteMapping(path = "/users/{username}/todos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteTodo(@PathVariable String username,@PathVariable long id){
		Todo theTodo = todoService.deleteById(id);
	}

	@PostMapping(path = "/users/{username}/todos")
	public ResponseEntity createTodo(@PathVariable String username, @RequestBody Todo theTodo) {
		Todo savedTodo = todoService.save(theTodo);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedTodo.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}

	@GetMapping(path = "/users/{username}/todos")
	public List<Todo> getAllTodos() {
		return todoService.findAll();
	}

	@GetMapping(path = "/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable long id) {
		Todo theTodo = todoService.findById(id);
		return theTodo;
	}
}
