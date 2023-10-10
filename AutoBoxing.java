
public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=100; //primitive
				Integer ob1=a; //autoboxing
				Integer ob2=new Integer(a);
				
				Float obj1=new Float(100.4);   //float object
				float x=obj1.floatValue();
				float y=obj1;  //unboxing
				
				String s1="21";
				int b=Integer.parseInt(s1);  //unboxing
				float c=Float.parseFloat(s1);
				double d=Double.parseDouble(s1);
				
				System.out.println("Haii..!");


	}

}
