package org.bit.db.login;

import org.bit.db.domain.UserProfile;
/**
 * 
 * @author phanidhar & leela
 *
 */
public class LoginService {
	
	 public UserProfile getUserDetails(String userId){
		 // TODO
		 return new UserProfile();
	 }
	 
	 public boolean changePassword(String userId, String newPassword){
		 //TODO
		 return false;
	 }
	 
	 public boolean createUser(UserProfile user){
		 // TODO
		 return true;
	 }
}
