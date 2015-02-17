package org.bit.db.domain;

import java.util.List;
/**
 * 
 * @author phanidhar
 * @author leela
 *
 */
public class Exam {
	private String name;
	private int questionCount;
	private ExamType type;
	private String langCode;
	private List<Question> questions;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	public ExamType getType() {
		return type;
	}
	public void setType(ExamType type) {
		this.type = type;
	}
	public String getLangCode() {
		return langCode;
	}
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Exam [name=" + name + ", questionCount=" + questionCount
				+ ", type=" + type + ", langCode=" + langCode + ", questions="
				+ questions + "]";
	}
	
	
}
