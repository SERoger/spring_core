package emp;

import java.util.List;
import java.util.Map;

public class Employee {
	private int empId;
	private String name;
	private int age;
	private Address address;
	private List<Task> tasks;
	private Map<Integer, String> manager;

	public Employee() {
	}

	public Employee(int empId, String name, int age, Address address, List<Task> tasks, Map<Integer, String> manager) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.tasks = tasks;
		this.manager = manager;
	}

	public void printValues() {
		System.out.println("id: " + empId);
		System.out.println("name: " + name);
		System.out.println("address: [" + address.getStreet() + " " + address.getCity() + " " + address.getState() + "]");
		System.out.println("tasks:");
		tasks.stream().forEach(System.out::println);
		System.out.println("manager: ");
		for (Map.Entry<Integer, String> entry : manager.entrySet())
			System.out.println("Id = " + entry.getKey() + ", Name = " + entry.getValue());
	}

}
