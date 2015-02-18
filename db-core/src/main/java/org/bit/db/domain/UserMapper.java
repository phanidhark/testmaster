package org.bit.db.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class UserMapper  implements RowMapper<User> {
	   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		   User user = new User();
		   user.setUsername(rs.getString("USERNAME"));
		   user.setPassword(rs.getString("PASSWORD"));
		   user.setFirstName(rs.getString("FIRST_NAME"));
		   user.setLastName(rs.getString("LAST_NAME"));
		   user.setEmail(rs.getString("EMAIL"));
		   user.setMobile(rs.getString("MOBILE"));
		   user.setEnabled(rs.getBoolean("enabled"));
	      return user;
	   }
	}