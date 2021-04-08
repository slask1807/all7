package javacollection.maintaskchain.entity.factory;


import javacollection.maintaskchain.entity.stone.PreciousStone;
import javacollection.maintaskchain.entity.stone.SemipreciousStone;
import javacollection.maintaskchain.entity.stone.Stone;
import javacollection.maintaskchain.enums.Color;
import javacollection.maintaskchain.enums.OpticalEffect;
import javacollection.maintaskchain.enums.PreciousStoneType;
import javacollection.maintaskchain.enums.SemipreciousStoneType;

import java.util.Random;

/**
 * Created by Rashid on 18.08.2015.
 */
public class StoneFactory {
    public static Stone createStone(){
        Random random = new Random();
        switch (random.nextInt(2)){
            case 0:
                return new PreciousStone(
                        random.nextDouble() * 10 + 0.1,
                        random.nextDouble() * 1000,
                        Color.values()[(new Random().nextInt(Color.values().length))],
                        PreciousStoneType.values()[(new Random().nextInt(PreciousStoneType.values().length))]
                );
            case 1:
                return new SemipreciousStone(
                        random.nextDouble() * 10 + 0.1,
                        random.nextDouble() * 1000,
                        Color.values()[(new Random().nextInt(Color.values().length))],
                        SemipreciousStoneType.values()[(new Random().nextInt(SemipreciousStoneType.values().length))],
                        OpticalEffect.values()[(new Random().nextInt(OpticalEffect.values().length))]
                );

            default:
                throw new IllegalArgumentException();
        }
    }
}
