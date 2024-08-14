
public class VoidandReturnTypeMethods2 {

	public void add(int a, int b)
	{  int c;
	   c=a+b;
		System.out.println("Final value is "+c);
	}
	public int Sub(int a, int b)
	{  int c;
	   c=a-b;
		return c;
	}
	public int Multiply(int a, int b)
	{  int c;
	   c=a*b;
		return c;
	}
	public int Devide(int a, int b)
	{  int c;
	   c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		VoidandReturnTypeMethods2 obj=new VoidandReturnTypeMethods2();
		int devideresult=obj.Devide(10, 2);
		int subresult=obj.Sub(devideresult, 2);
		int multiresult=obj.Multiply(subresult, 2);
		int subresult2=obj.Sub(multiresult, 2);
		obj.add(subresult2, 2);
		
	}
}
