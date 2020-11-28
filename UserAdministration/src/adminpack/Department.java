package adminpack;

import java.util.Scanner;

public class Department {
	public String departmentname;
	public int departmentnr;
	public String country;
	public String city;
	public Employee employee;

	public Department(String departmentname, int departmentnr, String country, String city) {
		super();
		this.departmentname = departmentname;
		this.departmentnr = departmentnr;
		this.country = country;
		this.city = city;
	}

	public Department() {

	}

	public void defaultdepartment() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: ");
		departmentname = scan.next();
		System.out.println("ID: ");
		departmentnr = scan.nextInt();
		System.out.println("Name: ");
		country = scan.next();
		System.out.println("Name: ");
		city = scan.next();
	}

	public boolean IsEqual(Employee other) {
		return this.departmentnr == other.id;
	}

}
