package quiz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import quiz.model.PossibleAnswer;
import quiz.model.Question;

public class Main1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		//Question 1 and its Possible Answers
		Question q1=(Question) context.getBean("question");
		q1.setId("Q1");
		q1.setDescription("What is my name ?");
		
		PossibleAnswer q1a=(PossibleAnswer) context.getBean("possibleAnswer");
		q1a.setId("a");
		q1a.setDescription("Roger Musoni");
		q1a.setGrade(5);
		
		PossibleAnswer q1b=(PossibleAnswer) context.getBean("possibleAnswer");
		q1b.setId("b");
		q1b.setDescription("Manasse Nkundimana");
		q1b.setGrade(0);
		
		List<PossibleAnswer> pas1=new ArrayList<PossibleAnswer>();
		pas1.add(q1a);
		pas1.add(q1b);
		
		q1.setPossibleAnswers(pas1);
		
		//Question 2 and its Possible Answers
		Question q2=(Question) context.getBean("question");
		q2.setId("Q2");
		q2.setDescription("Where do I live ?");
		
		PossibleAnswer q2a=(PossibleAnswer) context.getBean("possibleAnswer");
		q2a.setId("a");
		q2a.setDescription("Atlanta, Georgia");
		q2a.setGrade(5);
		
		PossibleAnswer q2b=(PossibleAnswer) context.getBean("possibleAnswer");
		q2b.setId("b");
		q2b.setDescription("Manassas, Virginia");
		q2b.setGrade(0);
		
		List<PossibleAnswer> pas2=new ArrayList<PossibleAnswer>();
		pas2.add(q2a);
		pas2.add(q2b);
		
		q2.setPossibleAnswers(pas2);
		
		//print  them
		q1.print();
		System.out.println();
		q2.print();
		
	}
}
