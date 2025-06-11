package fullstackjava;
import java.io.File;
import java.io.IOException;
public class Create2 {
	
	public static void main(String[]args)
	{
	  try {
		  File file=new File("C:\\New folder\\demo2.txt");
		  if(file.createNewFile())
		  {
			  System.out.println("File Created"+file.getName());
		  }
		  else {
			  System.out.println("File is allready exist");
		  }
	  }	
	 catch(IOException e)
	  {
		 System.out.println("an error occured");
		 e.printStackTrace();
	  }
	}
	}


