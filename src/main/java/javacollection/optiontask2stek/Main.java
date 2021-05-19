import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try {
            Stack stack = new Stack();
            int n = 0;
            System.out.println("Введите число ");
            Scanner sc1 = new Scanner(System.in);

            n = sc1.nextInt();

            char[] numbers = String.valueOf(n).toCharArray();
            for (char num : numbers) {
                stack.push(num);
            }

            while (!stack.empty()) {
                char stackNum;
                stackNum = (Character) stack.pop();
                System.out.print(stackNum);
            }
        } catch (InputMismatchException fg) {
            System.out.print("Вы ввели не число.");
        }
    }
}
