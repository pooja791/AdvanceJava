package fullstackjava;

//Abstract class representing a Vehicle (hiding implementation details)
abstract class Vehicle1 {
 // Abstract methods (what it can do)
 abstract void accelerate();
 abstract void brake();
 
 // Concrete method (common to all vehicles)
 void startEngine() {
     System.out.println("Engine started!");
 }


//Concrete implementation (hidden details)
 static class Car1 extends Vehicle1 {
 @Override
 void accelerate() {
     System.out.println("Car: Pressing gas pedal...");
     // Hidden complex logic: fuel injection, gear shifting, etc.
 }
 
 @Override
 void brake() {
     System.out.println("Car: Applying brakes...");
     // Hidden logic: hydraulic pressure, brake pads, etc.
 }
  }


 public static void main(String[] args) {
     Vehicle1 myCar = new Car1();
     myCar.startEngine();  
     myCar.accelerate();   
     myCar.brake();        
 }
}
