package fullstackjava;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int a=10/2;
        	System.out.println("Result"+a);
        	
        }catch(Exception e)
        {
        	System.out.println("Error"+e);
        }finally {
        	System.out.println("Always excuted finally block");
        }
	}

}
