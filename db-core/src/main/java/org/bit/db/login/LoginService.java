package org.bit.db.login;

import org.bit.db.domain.User;
import org.bit.db.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 
 * @author phanidhar & leela
 * 
 */

@Component
public class LoginService {

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	public User getUserDetails(String username) {
		String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
		User user = jdbcTemplateObject.queryForObject(sql,new Object[] { username }, new UserMapper());
		return user;
	}

	public int changePassword(String username, String newPassword) {
		User selUser = getUserDetails(username);
		if(selUser!=null){
			String sql ="UPDATE users SET PASSWORD = ? WHERE USERNAME = ?";
			Object[] params = new Object[] { newPassword,username};
			int count= jdbcTemplateObject.update( sql,params);
			return count;
		}
		return 0;
	}

	public int updateProfile(User user){
		User selUser = getUserDetails(user.getUsername());
		if(selUser!=null){
			String sql ="UPDATE users SET FIRST_NAME = ?, LAST_NAME =?, EMAIL = ?, MOBILE = ?, enabled = ? WHERE USERNAME = ?";
			Object[] params = new Object[] { user.getFirstName(),user.getLastName(),user.getEmail(),user.getMobile(),user.isEnabled(),user.getUsername()};
			int count= jdbcTemplateObject.update( sql,params);
			return count;
		}
		return 0;
	}
	public boolean createUser(User user) {
		String sql ="INSERT INTO `testmaster`.`users` (`USERNAME`, `PASSWORD`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE`, `enabled`)"+
				" VALUES (?,?,?,?,?,?,?)";
		Object[] params = new Object[] { user.getUsername(),user.getPassword(), user.getFirstName(),user.getLastName(),
				user.getEmail(),user.getMobile(),user.isEnabled()};
		int count= jdbcTemplateObject.update( sql,params);
		if(count>0){
		return true;
		}else{
			return false;
		}
	}

}
