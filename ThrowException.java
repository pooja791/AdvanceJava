package fullstackjava;
import java.lang.ArithmeticException;
public class ThrowException {
	
		 static void checkAge(int age) {
		if (age < 18)
		 throw new ArithmeticException("Access denied - You must be at least 18!");
		 else
		 System.out.println("Access granted!");
		 }
		 public static void main(String[] args) {
		 checkAge(20);
		 }
		 }