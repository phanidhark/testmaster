package org.bit.db.login;

import org.bit.db.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/db-core-config-test.xml" })
public class LoginServiceTest {

	@Autowired
	LoginService loginService;

	// @Test
	public void testUpate() {
		System.out.println("Start testUpate");
		User user = new User();
		user.setUsername("vaishu1");
		user.setFirstName("Vaishnavi");
		user.setLastName("Kammara");
		user.setEmail("007@test.com");
		user.setMobile("888888");
		user.setEnabled(true);
		System.out.println("loginService:" + loginService.updateProfile(user));
		System.out.println("Completed testUpate");
	}

	@Test
	public void testChangePassword() {
		System.out.println("Start testChangePassword");
		System.out.println("loginService:"
				+ loginService.changePassword("vaishu1", "tempPwd1"));
		System.out.println("Completed testChangePassword");
	}

	@Test
	public void testUserDetails() {
		System.out.println("Start testUserDetails");
		System.out.println("loginService:"
				+ loginService.getUserDetails("vaishu1"));
		System.out.println("Completed testUserDetails");
	}

	// @Test
	public void testCreateUser() {
		System.out.println("Start testCreateUser");
		User user = new User();
		user.setUsername("vaishu1");
		user.setPassword("test");
		user.setFirstName("Vaishnavi");
		user.setLastName("Kammara");
		user.setEmail("vaishu@test.com");
		user.setMobile("1234567892");
		user.setEnabled(true);
		System.out.println("loginService:" + loginService.createUser(user));
		System.out.println("Completed testCreateUser");
	}

}
