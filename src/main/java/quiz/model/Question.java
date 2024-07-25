package quiz.model;

import java.util.List;

public class Question {
	private String id;
	private String description;
	private List<PossibleAnswer> possibleAnswers;
	
	public Question(String id, String description, List<PossibleAnswer> possibleAnswers) {
		this.id = id;
		this.description = description;
		this.possibleAnswers = possibleAnswers;
	}

	public List<PossibleAnswer> getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(List<PossibleAnswer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	public Question(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void print() {
		System.out.println(id+". "+description);
		possibleAnswers.stream().forEach(System.out::println);
		System.out.println();
	}
	
	public float verifyAnswer(String id) {
		float grade=0;
		for(PossibleAnswer pa:possibleAnswers) {
			if(pa.getId().equals(id)) {
				grade=pa.getGrade();
				break;
			}
		}
		return grade;
	}
	
}
