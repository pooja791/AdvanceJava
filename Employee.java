package fullstackjava;

public class Employee {
String name;
int salary;
Employee(String name,int salary)
{
 this.name=name;
 this.salary=salary;
}
void display()
{
	System.out.println("name"+name+"salary"+salary);
}
public static void main(String[]args)
{
 Employee obj=new Employee("pooja",1200000);	
 obj.display();
}
}
 