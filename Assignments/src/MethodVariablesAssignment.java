
public class MethodVariablesAssignment {
	int rollno;
	int age;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	} 
	
	public static void main(String[] args) {
		MethodVariablesAssignment obj= new MethodVariablesAssignment();
		obj.rollno=101;
		obj.age=12;
		System.out.println("Value of roll number is "+obj.rollno);
		System.out.println("Value of age is "+obj.age);
		System.out.println();
		obj.display1();
		obj.display2();
	}

}
