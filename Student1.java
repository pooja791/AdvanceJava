package fullstackjava;

public class Student1 {
private int id;
private String name;
Student1(int id,String name)
{
	this.id=id;
	this.name=name;
}
//method demonstrating parameter passing
public void printStudent(String header) {
	System.out.println(header);
	System.out.println("id"+getId());
	System.out.println("nmae"+getName());
}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}

}
class main{
	public static void main(String[]args)
	{
		Student1 obj=new Student1(2,"pooja");
		//method with parameter
		obj.printStudent("Student Details:");
	}
}
