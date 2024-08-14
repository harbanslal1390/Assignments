
public class MethodwithThisKeyword {
	
	public void defaultmethod()
	{   this.threeParameterizedMethod(10,20,30);
		System.out.println("I am default method");
	}
	public void oneParameterizedMethod(int a)
	{
	    this.defaultmethod();
		System.out.println("I am one paramertized method");
	}
	
	public void twoParameterizedMethod(int a, int b)
	{	this.oneParameterizedMethod(10);
		System.out.println("I am two parametrized method");
	}
	public void threeParameterizedMethod(int a, int b, int c)
	{
		System.out.println("I am three parametrized method");
	}
	public void FourParameterizedMethod(int a, int b, int c, int d)
	{   this.twoParameterizedMethod(10, 20);
		System.out.println("I am four parametrized method");
	}
	public static void main(String[] args) {
		MethodwithThisKeyword obj= new MethodwithThisKeyword();
		obj.FourParameterizedMethod(10,20,30,40);
	}
	
}
