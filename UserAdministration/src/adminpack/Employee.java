package adminpack;

import java.util.Scanner;

public class Employee {
	public String firstname;
	public String lastname;
	public int id;
	public Department department;

	public Employee(String firstname, String lastname, int id, Department department) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.department = department;
	}

	public Employee() {

	}

	public void defaultuser() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Firstname: ");
		firstname = scan.next();
		System.out.println("Lastname: ");
		lastname = scan.next();
		System.out.println("Age: ");
		id = scan.nextInt();
		System.out.println("ID: ");
		department.departmentname = scan.next();
	}

	void print() {
		System.out.println("Employee " + id + " " + firstname + " " + lastname + " work in department "
				+ department.departmentname + " in " + department.city);
	}

	public boolean isEquals(Department other) {
		return this.id == other.departmentnr;
	}
}
