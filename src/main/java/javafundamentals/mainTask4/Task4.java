package javafundamentals.mainTask4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Введите два числа через Enter ");
            int x = vvod.nextInt();
            int y = vvod.nextInt();

            System.out.println("Sum= " + (x + y));
            System.out.println("Mutli= " + (x * y));
            break;
        }
    }
}