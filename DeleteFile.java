package fullstackjava;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File file=new File("example.txt");
     if(file.delete())
     {
    	 System.out.println("Deleted the file"+file.getName());
     }
     else {
    	 System.out.println("Failed to delete the file");
     }
	}

}
