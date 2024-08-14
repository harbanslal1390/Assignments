
public class ConstructorwithThisKeyword {
	public ConstructorwithThisKeyword()
	{
		this(10,20,30);
		System.out.println("I am default constructor");
	}
	public ConstructorwithThisKeyword(int a)
	{
		this(10,20);
		System.out.println("I am one parameter constructor");
	}
	public ConstructorwithThisKeyword(int a, int b)
	{
	    this();	
		System.out.println("I am two parameter constructor");
	}public ConstructorwithThisKeyword(int a, int b, int c)
	{
		
		System.out.println("I am Three parameter constructor");
	}
	
	public static void main(String[] args) {
		ConstructorwithThisKeyword obj= new ConstructorwithThisKeyword(10);
	}

}
