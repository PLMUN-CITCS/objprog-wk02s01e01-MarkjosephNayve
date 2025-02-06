public class VariablesAndCaseSensitivity {
    public static void main(String[] args) {
	//integer
	int studentAge = 15;
	// decimal (floating-point number)
	double itemPrice = 29.99;
	//string
	String studentName = "Alice";

	//demonstrating case sensitivity
	int counter = 10;
	int Counter = 20;

	//output the values
	System.out.println("Student Age: " + studentAge);
	System.out.println("Item Price: $" + itemPrice);
	System.out.println("Student Name: " + studentName);
	System.out.println("Counter: " + counter);
	System.out.println("Counter (Different Case): " + Counter);
    }
}