package fullstackjava;

public class constructor {

	
		// TODO Auto-generated method stub
      String name;
      int age;

      constructor(String name,int age){
    	  this.name=name;
    	  this.age=age;
      }
	
 public static void main(String[]args) {
	 constructor obj=new constructor("pooja",23);
	 System.out.println("name is:"+obj.name);
	 System.out.println("age is:"+obj.age);
 }
}
