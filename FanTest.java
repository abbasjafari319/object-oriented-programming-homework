package fantest;

public class FanTest {

    public static void main(String[] args) {

// Create a Fan object with maximum speed, radius 10, color yellow, and turn it on to the first object
        Fan fan1 = new Fan(Fan.FAST, true, 10.0, "yellow");
        System.out.println("\nFan 1:");
        System.out.println(fan1.toString());

        // Create a Fan object with medium speed, radius 5, color blue, and turn it off to the second object
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5.0, "blue");
        System.out.println("\nFan 2:");
        System.out.println(fan2.toString());

    }
    
}
