package org.bit.db.login;
import org.bit.db.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author phanidhar & leela
 *
 */
public class LoginServiceTest {
	
	
	LoginService loginService ;
	
	@Test
	public void testUserDetails(){
		System.out.println("Start testUserDetails");
		ApplicationContext context = new ClassPathXmlApplicationContext("config/db-core-config-test.xml");
		loginService = (LoginService)context.getBean("loginService");
		System.out.println("loginService:"+loginService.getUserDetails("vaishu"));
		System.out.println("Completed testUserDetails");
	}
	
	//@Test
	public void testCreateUser(){
		System.out.println("Start testUserDetails");
		ApplicationContext context = new ClassPathXmlApplicationContext("config/db-core-config-test.xml");
		loginService = (LoginService)context.getBean("loginService");
		User user = new User();
		user.setUsername("vaishu");
		user.setPassword("test");
		user.setFirstName("Vaishnavi");
		user.setLastName("Kammara");
		user.setEmail("vaishu@test.com");
		user.setMobile("1234567892");
		user.setEnabled(true);
		System.out.println("loginService:"+loginService.createUser(user));
		System.out.println("Completed testUserDetails");
	}
	
	
}
