package fullstackjava;

public class Student {
	String name;
	int rollNo;
	
	Student(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
  void display()
  {
	  System.out.println("name: "+name+" rollNo: "+rollNo);
  }
  public static void main(String[]args)
  {
	  Student obj=new Student("pooja",2);
	  obj.display();
  }
}
