package fullstackjava;
//class
public class Car {
String model;
int year;
Car(String model,int year)
{
this.model=model;
this.year=year;

}
void display()
{
   System.out.println(model+" "+year);	
}
 public static void main(String[]args) {
	 Car obj=new Car("tata",2004);
	 obj.display();
 }
}
