package quiz.model;

public class PossibleAnswer {
	private String id;
	private String description;
	private float grade;

	
	
	public PossibleAnswer() {
		super();
	}

	public PossibleAnswer(String id, String description, float grade) {
		this.id = id;
		this.description = description;
		this.grade = grade;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
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

	@Override
	public String toString() {
		return id + ". " + description+".";
	}
	
	
}
