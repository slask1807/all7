package javafundamentals.mainTask2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer revers = new StringBuffer(input.nextLine());
            revers.reverse();
            System.out.println("Отображение консоли в обратном порядке " + revers.toString());

        }
    }
}


