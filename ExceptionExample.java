package value;
import java.util.Scanner;
public class ExceptionExample {

	public static void main(String[] args) 
	{
				Scanner sc=new Scanner(System.in);
				int a,b,x;
				System.out.println("Enter two numbers ");
				a=sc.nextInt();
				b=sc.nextInt();
				x=a-b;
				try
				{
					if(x!=0)
					{
						System.out.println("The result is "+a/x);
					}
					else
					{
						System.out.println("The result is "+b/x);
					}
				}
				catch(Exception e)
				{
					/*System.err.println("Error Occured!!!! ");
					System.err.println("Dont give same values as inputs");*/
					//System.err.println(e);
					//System.err.println(e.getMessage());
					e.printStackTrace();
				}
				
				System.out.println("This is demo program...");
				System.out.println("Thank you for using this application");
				System.out.println("Bye...");
					}
	}


