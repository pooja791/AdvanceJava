package fullstackjava;
//object
 class cars{
String model;
int year;
cars(String model,int year)
{
this.model=model;
this.year=year;

}
}
 class car{
public static void main(String[]args) {
	 cars obj=new cars("tata",2004);
	System.out.println("car maodel:"+obj.model);
	System.out.println("car year:"+obj.year);
}
}
