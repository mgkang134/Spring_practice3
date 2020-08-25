package com.example.demo2.exam;

public class EnglishExam implements Exam {

	private int examResult;
	
	@Override
	public int showResult() {
		return examResult;
	}

	public void setExamResult(int examResult) {
		this.examResult = examResult;
	}

}
