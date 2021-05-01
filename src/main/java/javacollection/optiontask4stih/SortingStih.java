package javacollection.optiontask4stih;

import java.util.*;

public class SortingStih {

    public static void main(String[] args) {

        System.out.println("Сортировка стиха по длине строк");

        List<String> cities = new ArrayList<>(Arrays.asList(
                "\n Мороз и солнце день чудесный",
                "\n Еще ты дремлешь друг прелестный",
                "\n Пора красавица проснись",
                "\n Открой сомкнуты негой взоры",
                "\n Навстречу северной Авроры"));
        System.out.println("Оригинальный текст");
        System.out.println(cities);

        cities.sort((first, second) -> Integer.compare(first.length(), second.length()));

        System.out.println("Отсортированный текст");
        System.out.println(cities);
    }
}
