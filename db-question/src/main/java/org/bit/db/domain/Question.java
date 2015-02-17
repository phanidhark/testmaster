package org.bit.db.domain;
/**
 * 
 * @author phanidhar
 * @author leela
 *
 */
public class Question {
	private String id;
	private QuestionType type;
	private String question;
	private String answer;
	private String complexity;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public QuestionType getType() {
		return type;
	}
	public void setType(QuestionType type) {
		this.type = type;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", type=" + type + ", question="
				+ question + ", answer=" + answer + ", complexity="
				+ complexity + "]";
	}
	
}
