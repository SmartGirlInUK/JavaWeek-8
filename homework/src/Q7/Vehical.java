package Q7;

/*7. Write a Java program to create a class Vehicle with a method called speedUp(). Create
    two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
    increase the vehicle's speed differently.*/
public class Vehical {
    public static void main(String[] args) {
        Vehical v = new Vehical();
        v.speedup();
    }

    public void speedup() {

        System.out.println("Vehical has Different Speed");
    }
}