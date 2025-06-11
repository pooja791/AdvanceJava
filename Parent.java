package fullstackjava;

	class Main {
	   
	    public void func() {
	        System.out.println("Main.func()");
	    }
	​
	    // Overloaded method (same name, different parameter)
	    public void func(int a) {
	        System.out.println("Main.func(int): " + a);
	    }
	}
	// Child Class
	class Child extends Main {
	   
	    @Override
	    public void func(int a) {
	        System.out.println("Child.func(int): " + a);
	    }
	}
	public class Parent {
	    public static void main(String[] args) {
	        Main parent = new Main();
	        Child child = new Child();
	        // Dynamic dispatch
	        Main polymorphicObj = new Child();  

	        // Method Overloading (compile-time)
	        parent.func();       
	        parent.func(10);    

	        // Method Overriding (runtime)
	        child.func(20);     

	     
	        polymorphicObj.func(30);  
	    }
	}
