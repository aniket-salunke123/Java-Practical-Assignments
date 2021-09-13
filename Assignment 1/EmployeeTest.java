/*
	Define an Employee class (name, position, salary). Define a default and parameterized
	constructor. Override the toString method. Keep a count objects created. Create objects using parameterized constructor and display the object count after each object is created. (Use static member and method). Also display the contents of each object.
*/
import java.io.*;

class Employee 
{
	String name, position;
	double salary;

	static int objcount = 0;

	// Default Constructor
	Employee()
	{
		name = "";
		position = "";
		salary = 0;
	}

	// Parameterized Constructor 
	Employee(String name, String position, double salary)
	{
		this.name = name;
		this.position = position;
		this.salary = salary;

		// Increasing the counter at each object creation
		objcount++;

		System.out.println("Objetcs Count : " + Employee.objcount + "\n\n");

	}

	// overriding toString method
	public String toString()
	{
		return "Name : " + this.name + "\nPosition : " + this.position + "\nSalary : " + this.salary + "\n==================\n";
	}



}

class EmployeeTest
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		System.out.println("How many Records : ");
		int n = Integer.parseInt(br.readLine());

		// creating an array of objects
		Employee E[] = new Employee[n];

		System.out.println("Enter Records for " + n + "Objects");
		for (int i=0; i<n; i++)
		{
			System.out.println("Enter Name : ");
			String name = br.readLine();

			System.out.println("Enter Position : ");
			String position = br.readLine();

			System.out.println("Enter Salary : ");
			double salary = Double.parseDouble(br.readLine());

			E[i] = new Employee(name, position, salary);
		}

		// for printing data of all objects

		for (int i=0; i<n; i++)
		{
			System.out.println(E[i]);			
		}
	}
}