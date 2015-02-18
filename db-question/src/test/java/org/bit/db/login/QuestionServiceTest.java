package org.bit.db.login;

import org.bit.db.question.QuestionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:/org/bit/db/login/db-question-test.xml"})
public class QuestionServiceTest {
	
	@Autowired
	QuestionService questionService ;
	
	@Test
	public void testUserDetails(){
		System.out.println("Start testUserDetails");
		System.out.println("QuestionService"+questionService);
		System.out.println("==>>"+questionService.getQuestions());
		System.out.println("Completed testUserDetails");
	}
	
	
}
