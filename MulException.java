package fullstackjava;

public class MulException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 int arr[]=new int[5];
    	 arr[5]=100;
     }catch(ArithmeticException e)
     {
    	 System.out.println("Arithmetic Error");
    	 
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("array index out of bounds");
    	 
     }catch(Exception e) {
    	 System.out.println("Generic Exception"+e);
     }
	}

}
