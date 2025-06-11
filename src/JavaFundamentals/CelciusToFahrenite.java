package JavaFundamentals;

import java.util.Scanner;

public class CelciusToFahrenite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempC = sc.nextInt();
        double tempF = (tempC + (9/5)) + 32;
        System.out.println(tempF + "F");
    }
}
