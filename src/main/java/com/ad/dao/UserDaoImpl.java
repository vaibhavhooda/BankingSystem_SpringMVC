package com.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ad.beans.Login;

public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	//insert method to register user
	public int register(Login user) {

		String sql = "insert into login values(?,?,?)";

		return jdbcTemplate.update(sql, new Object[] { user.getUserId(),user.getUsername(), user.getPassword() });
				 
	}

	//getting the user data for login
	public Login validateUser(Login login) {

		String sql = "select * from login where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";

		List<Login> users = jdbcTemplate.query(sql, new UserMapper());

		return users.size() > 0 ? users.get(0) : null;
	}

}

class UserMapper implements RowMapper<Login> {

	//RowMapper to set the values to the User_GroupE bean class
	public Login mapRow(ResultSet rs, int arg1) throws SQLException {
		Login user = new Login();
		//setting the user info
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setUserId(rs.getInt("userId"));
		return user;
	}
}

