package JavaFundamentals;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        double Si = (principal * rate * time)/100;
        System.out.println("The interest is " + Si);
    }
}
