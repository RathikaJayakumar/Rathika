package value;

class MyTest<T>
{
	T ob;
	void set(T ob)
	{
		this.ob=ob;
	}
	T get()
	{
		return ob;
	}
}

public class GenericClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
				MyTest <Integer> obj1=new MyTest<Integer>();
				obj1.set(100);
				System.out.println("The integer value is "+obj1.get());
				
				MyTest <Double> obj2=new MyTest<Double>();
				obj2.set(10.6);
				System.out.println("The Double value is "+obj2.get());
				
				MyTest <String> obj3=new MyTest<String>();
				obj3.set("Hello");
				System.out.println("The String value is "+obj3.get());
			}

		

	}
