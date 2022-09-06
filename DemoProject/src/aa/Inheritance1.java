package aa;
 class Member
{
	String name,address;
	int age,number,salary;
	public void printSalary()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(number);
		System.out.println(salary);
	}
}
 class Employee extends Member
 {
	 String dept,spec;   
 }
 class Manager extends Member
 {
	 String dept,spec;
 }
public class Inheritance1 {
	public static void main(String[] args)
	{
		Employee e = new Employee();
		Manager m = new Manager();
		e.name ="rr";
		e.address="asjhbsa";
		e.age=24;
		e.number=847485;
		e.salary=22837;
		e.printSalary();
		m.name ="pp";
		m.address="jsdbfjs";
		m.age=42;
		m.number=9474595;
		m.salary=22837;
		e.printSalary();
		System.out.println();
		m.printSalary();
	}
}
