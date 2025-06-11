package JavaFundamentals;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int peri = 2*(l+b);
        System.out.println(peri);
    }
}
