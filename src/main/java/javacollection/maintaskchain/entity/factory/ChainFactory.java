package javacollection.maintaskchain.entity.factory;

import javacollection.maintaskchain.entity.chain.Chain;
import javacollection.maintaskchain.enums.ChainType;
import javacollection.maintaskchain.enums.Fineness;

import java.util.Random;


public class ChainFactory {
    public static Chain createChain(){
        Random random = new Random();
        return new Chain(
                ChainType.values()[(new Random().nextInt(ChainType.values().length))],
                random.nextDouble() * 10 + 0.1,
                Fineness.values()[(new Random().nextInt(Fineness.values().length))]);
    }
}
