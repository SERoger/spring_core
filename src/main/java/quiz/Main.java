package quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import quiz.model.History;
import quiz.model.Question;

public class Main {
	protected static final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	protected static Map<String, String> answers=new HashMap<String, String>();
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println("**************** Welcome to Spring E-Quiz **********************");
		System.out.println();
		Scanner scanner=new Scanner(System.in);
		menu();
		System.out.println();
		System.out.print("StudentId:");
		String id=scanner.nextLine();
		System.out.print("StudentName:");
		String name=scanner.nextLine();
		System.out.println();
		System.out.println("You have 10 minutes to answer these questions:");
		System.out.println();
		Question question1 = (Question) context.getBean("question1");
		question1.print();
		System.out.println("Answer:");
		String a1=scanner.nextLine();
		addAnswer(question1.getId(), a1);
		System.out.println();
		Question question2 = (Question) context.getBean("question2");
		question2.print();
		System.out.println("Answer:");
		String a2=scanner.nextLine();
		addAnswer(question2.getId(), a2);
		System.out.println();
		addHistory(id, name,(question1.verifyAnswer(a1)+question2.verifyAnswer(a2)));
		menu();
		System.out.println();
		System.out.println("********************* Bye! *************************");
	}

	public static void menu() {
		// Menu
		System.out.println("1. Proceed");
		System.out.println("2. View Histoory");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n Your choice here: ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			break;
		case 2:
			displayHistory();
			break;
		default:
			System.out.println("Invalid Choice. Let's start.\n");
			menu();
			break;
		}
	}
	
	public static void addAnswer(String q,String a) {
		answers.put(q, a);
	}
	
	public static void addHistory(String id,String name,float totalGrades) {
		History history=(History) context.getBean("history");
		history.setStudentId(id);
		history.setStudentName(name);
		history.setAnswers(answers);
		history.setTotalGrades(totalGrades);
	}
	
	public static void displayHistory() {
		History history=(History) context.getBean("history");
		System.out.println(history);
	}
}
