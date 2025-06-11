package JavaFundamentals;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance_In_Km = sc.nextDouble();
        double distance_In_Miles = distance_In_Km * 0.621371;
        System.out.println(distance_In_Miles);
    }

}
