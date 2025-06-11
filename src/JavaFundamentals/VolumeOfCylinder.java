package JavaFundamentals;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the Cylinder: ");
        double height = sc.nextDouble();
        double volume = 3.14*radius * radius * height;
        System.out.println("The volume of the circle is " + volume);
    }
}
