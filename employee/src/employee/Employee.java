package employee;

public class Employee {
	public static void main(String[] args) {
		EmployeeData ed=new EmployeeData();
		ed.setEmpid(1234);
		System.out.println(ed.getEmpid());
		ed.setName("Vinit");
		System.out.println(ed.getName());
		ed.setDepartment("development");
		System.out.println(ed.getDepartment());
		ed.setSalary(15000);
		System.out.println(ed.getSalary());
		ed.setEmail("vinit@gmail.com");
		System.out.println(ed.getEmail());
		ed.setPhonenum(974756435);
		System.out.println(ed.getPhonenum());
		ed.setDesignation("Developer");
		System.out.println(ed.getDesignation());
	}

}

@restcontroller
class EmployeeData{
	private int empid;
	private String name;
	private String department;
	private int salary;
	private String email;
	private int phoneNumber;
	private String designation;
	
	
	void setName(String n)
	{
		name = n;
	}
	String getName()
	{
		return name;
	}
	void setDepartment(String d)
	{
		department = d;
	}
	String getDepartment()
	{
		return department;
	}
	void setSalary(int s)
	{
		salary = s;
	}
	int getSalary()
	{
		return salary;
	}
	void setEmail(String em)
	{
		email = em;
	}
	String getEmail()
	{
		return email;
	}
	void setPhonenum(int p)
	{
		phoneNumber = p;
	}
	int getPhonenum()
	{
		return phoneNumber;
	}
	void setDesignation(String d)
	{
		designation = d;
	}
	String getDesignation()
	{
		return designation;
	}
	
}
