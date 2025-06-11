package fullstackjava;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidObjectException;
public class WriteFile {
	public static void main(String[]args)
	{
		try {
			FileWriter writer=new FileWriter("example.txt");
			writer.write("hello,this is file\nWelcome to java handling");
			writer.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e) {
			
			System.out.println("error occured");
			e.printStackTrace();
		}
		}
	}


