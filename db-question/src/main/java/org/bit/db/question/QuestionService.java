package org.bit.db.question;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.bit.db.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author phanidhar
 * @author leela
 *
 */

@Component
public class QuestionService {
	
	@Autowired
	private DataSource dataSource;
	
	public List<Question> getQuestions(){
		System.out.println("Getting questions");
		System.out.println("DataSource"+dataSource);
		try {
			System.out.println("User"+dataSource.getConnection().getMetaData().getUserName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
