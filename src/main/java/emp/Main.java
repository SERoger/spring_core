package emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp1=(Employee) context.getBean("empbean1");
		Employee emp2=(Employee) context.getBean("empbean2");
		Employee emp3=(Employee) context.getBean("empbean3");
		emp1.printValues();
		emp2.printValues();
		emp3.printValues();
	}
}
