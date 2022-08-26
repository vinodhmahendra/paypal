package paypal.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import paypal.model.Todo;

@Repository(value = "todoRepository")
public class TododRepositoryImpl implements TodoRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public TododRepositoryImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Todo> findAll() {
		String query = "select * from todos";
		List<Todo> todos = this.jdbcTemplate.query(query, todoRowMapper);
		return todos;
	}

	@Override
	public Todo findById(long theId) {
		String query = "select * from todos where id = ?";
		Todo loadedTodo = this.jdbcTemplate.queryForObject(query, todoRowMapper, theId);
		return loadedTodo;
	}

	@Override
	public Todo save(Todo theTodo) {
		//Assigment
		return null;
	}

	@Override
	public Todo deleteById(long theId) {
		String query = "delete from todos where id = ?";
		this.jdbcTemplate.update(query,Long.valueOf(theId));
		return null;
	}

	// Java 8 Lambda Expression
	private final RowMapper<Todo> todoRowMapper = (rs, rowNum) -> {
		Todo theTodo = new Todo();
		theTodo.setId(rs.getInt("id"));
		theTodo.setUsername(rs.getString("username"));
		theTodo.setDescription(rs.getString("description"));
		theTodo.setTargetDate(rs.getDate("targetDate"));
		theTodo.setDone(rs.getBoolean("is_done"));
		return theTodo;
	};

//	class TodosRowMapper implements RowMapper<Todo>{
//
//		@Override
//		public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Todo theTodo = new Todo();
//			theTodo.setId(rs.getInt("id"));
//			theTodo.setUsername(rs.getString("username"));
//			theTodo.setDescription(rs.getString("description"));
//			theTodo.setTargetDate(rs.getDate("targetDate"));
//			theTodo.setDone(rs.getBoolean(is_done));
//			return theTodo;
//		}
//		
//	}

}
