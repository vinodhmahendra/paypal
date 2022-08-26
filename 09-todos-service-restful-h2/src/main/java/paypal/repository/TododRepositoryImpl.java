package paypal.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
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
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement statement =
						con.prepareStatement("insert into todos(username,description,target_date,is_done) values(?,?,?,?)"+ "",Statement.RETURN_GENERATED_KEYS);
				statement.setString(1, theTodo.getUsername());
				statement.setString(2, theTodo.getDescription());
				statement.setDate(3,new Date(10) );
				statement.setBoolean(4, false);
				return statement;
			}
		},holder);
		
		long primarykey = holder.getKey().longValue();
		
		return findById(primarykey);
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
		theTodo.setTargetDate(rs.getDate("target_date"));
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
