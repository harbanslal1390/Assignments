import java.util.Scanner;

public class ScannerClass {
	
	
	public static int sum(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	public static int sub(int a, int b)
	{
		int c=a-b;
		return c;
		
	}
	public static int Mul(int a, int b)
	{
		int c=a*b;
		return c;
		
	}
	public static void Div(int a, int b)
	{
		int c=a/b;
		System.out.println("The final value is : " + c);
		
	}
	public static void main(String[] args) {
		Scanner objScanner=new Scanner(System.in);
		System.out.println("Enter the value of x1 :");
		int x1=objScanner.nextInt();
		System.out.println("Enter the value of x2 :");
		int x2=objScanner.nextInt();
		System.out.println("Enter the value of x3 :");
		int x3=objScanner.nextInt();
		System.out.println("Enter the value of x4 :");
		int x4=objScanner.nextInt();
		System.out.println("Enter the value of x5 :");
		int x5=objScanner.nextInt();
		System.out.println("Enter the value of x6 :");
		int x6=objScanner.nextInt();
	
		ScannerClass obj= new ScannerClass();
		int mul=obj.Mul(x1, x2);
		int sum1=obj.sum(x3, mul);
		int mul1=obj.Mul(sum1, x4);
		int sub=obj.sub(mul1, x5);
		obj.Div(sub, x6);
		
		
		
		
	}

}
