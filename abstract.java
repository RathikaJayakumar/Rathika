package value;
abstract class Subject {
    Subject() {
        System.out.println("Welcome to Base class");
    }

    abstract float performAddition(float a, float b);

    abstract float performAddition(int a, int b, int c);
}


class Sum extends Subject {
    float performAddition(float a, float b) {
        return a + b;
    }

    float performAddition(int a, int b, int c) {
        return a + b + c;
    }
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum add = new Sum();
		float Sum1 = add.performAddition(7, 8);
		System.out.println(Sum1);
		float Sum2 = add.performAddition(6, 9, 5);
		System.out.println(Sum2);
	}
}
