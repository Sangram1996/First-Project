package exceptionhandling;

public class Example {
	void display()
	{
		try{
			int a= 10/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Exception is handled");
		}
	}

}

