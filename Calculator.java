import java.lang.*;
import java.util.*;
class Calc
{
	int result; //instance variables
	int x;
        int y;
        int no;
	Calc(int x, int y){
        this.x=x;
        this.y=y;
        }
	 void add()
	{
		int result=x+y;
		System.out.println("The Result is:"+result);
	}
	 void sub()
	{
		int result=x-y;
		System.out.println("The Result is:"+result);
	}
	 void mult()
	{
		int result=x*y;
		System.out.println("The Result is:"+result);
	}
	 void div()
	{
		int result=x/y;
		System.out.println("The Result is:"+result);
	}
}
class Calculator
{
	public static void main(String args[])
	{	
		Scanner d=new Scanner(System.in);
		System.out.print("The first number is:  ");
		int x=d.nextInt();

                System.out.print("The second number is:  ");
		int y=d.nextInt();
		Calc a=new Calc(x,y);

		System.out.println("Press-1 for Addition");
		System.out.println("Press-2 for Subtraction");
		System.out.println("Press-3 for Multiplication");
		System.out.println("Press-4 for Division");
		System.out.println("Enter Your Choice:");
		Scanner ab=new Scanner(System.in);
		int no=ab.nextInt();
		
		
		switch(no)
		{
			case 1:
				{
					
					a.add();
					break;
				}
			case 2:
				{
				
					a.sub();
					break;
				}
			case 3:
				{
					
					a.mult();
					break;
				}
			case 4:
				{
					
					a.div();
					break;
				}
		}
	}
}