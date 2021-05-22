package javacollection.maintaskchain.logic;

import javacollection.maintaskchain.entity.stone.Stone;
import javacollection.maintaskchain.enums.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Actions {
    public static void stonesSortByPrice(List<Stone> stones) {
        stones.sort(Comparator.comparingDouble(Stone::getPrice));
    }

    public static void stonesSortByWeight(List<Stone> stones) {
        stones.sort(Comparator.comparingDouble(Stone::getWeight));
    }

    public static List<Stone> findStoneByColor(String color, List<Stone> stones) {
        List<Stone> foundStones = new ArrayList();
        for (Stone stone : stones) {
            if ((Color.valueOf(color)).equals(stone.getColor())) {
                foundStones.add(stone);
            }
        }
        return foundStones;
    }
}
