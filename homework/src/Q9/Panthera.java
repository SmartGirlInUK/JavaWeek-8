package Q9;

public class Panthera extends Animal {

    public static void main(String[] args) {
        Panthera p = new Panthera();
        p.move();
        p.makesound();
    }

    public void move() {

        System.out.println("Animal's Moves differently");
        System.out.println("Runs Fastest");
    }

    public void makesound() {

        System.out.print("They make sound: ");
        System.out.println("Roar");
    }
}