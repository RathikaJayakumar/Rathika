package value;
class Box<T>
{
	public static <T> void get(T length, T breadth)
	{
		System.out.println("The integer value is"+length +""+breadth);
		System.out.println("The double value is"+length +""+breadth);
	}
}


public class GenericMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> a = new Box<Integer>();
		a.get(3,8);
		
		Box<Double> a1 = new Box<Double>();
		a1.get(3.4,8.6);	

	}

}
