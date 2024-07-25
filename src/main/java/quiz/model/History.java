package quiz.model;

import java.util.Map;

public class History {
	private String studentId;
	private String studentName;
	private Map<String, String> answers;
	private float totalGrades;

	public History() {
		super();
	}
	
	public Map<String, String> getAnswers() {
		return answers;
	}
	
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getTotalGrades() {
		return totalGrades;
	}

	public void setTotalGrades(float totalGrades) {
		this.totalGrades = totalGrades;
	}

	@Override
	public String toString() {
		System.out.println();
		answers.entrySet().stream().forEach((a)->{System.out.println("Q: "+a.getKey()+", A: "+a.getValue());});
		return " student Id: "+studentId+"\n student Name: "+studentName+"\n grades: "+totalGrades;
	}

	
}
