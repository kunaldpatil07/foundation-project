package com.revature.model;

import com.revature.util.QuestionsSection;

public class QuestionManagement {
	 String questionId;
	 QuestionsSection qustionSection;
	 String questionText;

	public QuestionManagement() {

	}

	public QuestionManagement(String questionId, QuestionsSection qustionSection, String questionText) {

		this.questionId = questionId;
		this.qustionSection = qustionSection;
		this.questionText = questionText;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public QuestionsSection getQustionSection() {
		return qustionSection;
	}

	public void setQustionSection1(QuestionsSection qustionSection) {
		this.qustionSection = qustionSection;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public void setQustionSection(QuestionsSection questionSection) {
		// TODO Auto-generated method stub
		
	}

}
