
public class VoidandReturnTypeMethods {

	public int add(int a, int b)
	{  int c;
	   c=a+b;
		return c;
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
	public void Devide(int a, int b)
	{  int c;
	   c=a/b;
		System.out.println("Final value is "+c);
	}
	
	public static void main(String[] args) {
		VoidandReturnTypeMethods obj=new VoidandReturnTypeMethods();
		int sumresult=obj.add(10,2);
		int mulresult=obj.Multiply(sumresult, 2);
		int subresult=obj.Sub(mulresult,2);
		int mulresult2=obj.Multiply(subresult, 2);
		obj.Devide(mulresult2, 2);
		
		
	}
}
