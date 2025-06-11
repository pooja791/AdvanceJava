package fullstackjava;
class InvalidAgeException extends Exception {
 InvalidAgeException(String message) {
 super(message);
 }
}
public class CustumException {
	static void validate(int age) throws InvalidAgeException {
		 if (age < 18)
		 throw new InvalidAgeException("Not eligible to vote"); 
		 else
		 System.out.println("Eligible to vote");
		 
}
	public static void main(String[] args) {
		 try {
		 validate(15);
		 } catch (InvalidAgeException e) {
		 System.out.println("Exception: " + e.getMessage());
		 }
		 }
		 }