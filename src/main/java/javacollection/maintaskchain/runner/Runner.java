package javacollection.maintaskchain.runner;


import javacollection.maintaskchain.entity.Necklace;
import javacollection.maintaskchain.enums.Color;
import javacollection.maintaskchain.logic.Actions;
import javacollection.maintaskchain.logic.Manager;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Necklace necklace = new Necklace();
        Manager manager = new Manager();
        int key;
        int countStone;
        String colour;
        while (1 == 1) {
            try {
                System.out.println(" \n 1-Create necklace \n "
                        + "2-Calculate total weight \n "
                        + "3-Calculate total stones cost \n "
                        + "4-Sort stones by  price \n "
                        + "5-Sort stones by  weight \n "
                        + "6-find stone by color \n"
                        + " 7-close \n");
                key = in.nextInt();
                switch (key) {
                    case 1: {
                        System.out.println("Enter the number of stones in necklace");
                        countStone = in.nextInt();
                        manager.createNecklace(necklace, countStone);
                        System.out.println(necklace);
                        break;
                    }
                    case 2: {
                        System.out.println("Total carat weight: "
                                + manager.calculateTotalCaratWeight(necklace
                                .getStonesList()));
                        break;
                    }
                    case 3: {
                        System.out.println("Total stones cost: "
                                + manager.calculateTotalStonesCost(necklace
                                .getStonesList()));
                        break;
                    }
                    case 4: {
                        System.out.println("Stones sorted: ");
                        Actions.stonesSortByPrice(necklace.getStonesList());
                        System.out.print(necklace.getStonesList());
                        break;
                    }
                    case 5: {
                        System.out.println("Stones sorted: ");
                        Actions.stonesSortByWeight(necklace.getStonesList());
                        System.out.print(necklace.getStonesList());
                        break;
                    }
                    case 6: {
                        System.out.println("Enter the criterion of color");
                        for (Color color : Color.values()) {
                            System.out.print(color.name() + " ");
                        }
                        colour = in.next();
                        System.out.println("Find stones by color: ");
                        System.out.print(Actions.findStoneByColor(
                                colour.toUpperCase(), necklace.getStonesList()));
                        break;
                    }
                    case 7: {
                        System.out.println("вы завершили программу");
                        System.exit(0);
                        break;
                    }
                    default: {
                        //throw new NoNumberException("Invalid day: ");
                        System.out.println("вы ввели неверное число ");
                        //break;
                    }
                }

            } catch (Exception e) {
                System.out.println("Вы ввели не число");
                break;
            }
        }
    }
}
