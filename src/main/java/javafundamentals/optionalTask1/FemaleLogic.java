package javafundamentals.optionalTask1;

import java.util.Scanner;

class FemaleLogic {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа в строчку через пробел");
        String line = in.nextLine();
        //in.close();
        String longWord = "", shortWord = line;
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println("Самое длиное число: '" + longWord + "'");
        System.out.println("Длина: " + longWord.length());
        System.out.println("Самое короткое число: '" + shortWord + "'");
        System.out.println("Длина: " + shortWord.length());
        System.out.println("Введите еще раз эти же числа через Enter");
        for(int i = 0; i < 3; i++){
            arr[i] = in.nextLine();
        }
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами */
                if( arr[j].length() > arr[j+1].length() ){
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
//выводим результат на экран:
        for(int i = 0; i < arr.length; i++){
            System.out.println("сортировка: " + arr[i]);
        }
    }}
