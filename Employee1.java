package fullstackjava;

public class Employee1 {
 private String name;
 private float salary;
 
 public Employee1(String name,float salary)
 {
	 this.name=name;
	 this.salary=salary;
 }
 //getter method
 public String getName()
 {
	 return name;
 }
 public float getSalary()
 {
	 return salary;
 }
 //setter
 public void setName(String name)
 {
	 this.name=name;
 }
 public void setSalary(float salary)
 {
	 this.salary=salary;
 }
 void display()
 {
	 System.out.println("salary:"+salary);
	 System.out.println("name:"+name); 
 }
 public static void main(String[]args)
 {
	 Employee1 obj=new Employee1("pooja",2000);
	 obj.display();
 }
}
