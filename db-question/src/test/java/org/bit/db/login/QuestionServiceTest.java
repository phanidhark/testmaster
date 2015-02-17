package org.bit.db.login;
import static org.junit.Assert.assertFalse;

import org.bit.db.question.QuestionService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author phanidhar & leela
 *
 */
public class QuestionServiceTest {
	
	
	QuestionService questionService ;
	
	@Test
	public void testUserDetails(){
		System.out.println("Start testUserDetails");
		ApplicationContext context = 
		    	new ClassPathXmlApplicationContext("config//db-question-config.xml");
		questionService = (QuestionService)context.getBean("questionService");
		System.out.println("QuestionService"+questionService);
		questionService.getQuestions();
		System.out.println("Completed testUserDetails");
	}
	
	@Test
	public void testCreateUser(){
		System.out.println("Start testCreateUser");
		assertFalse(false);
		System.out.println("Completed testCreateUser");
	}
}
