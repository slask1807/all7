package javacollection.maintaskchain.entity;

import javacollection.maintaskchain.entity.chain.Chain;
import javacollection.maintaskchain.entity.stone.Stone;

import java.util.ArrayList;
import java.util.List;

public class Necklace {

    private List<Stone> stonesList = new ArrayList<Stone>();
    private Chain chain;

    public Necklace() {
    }

    public List<Stone> getStonesList() {
        return stonesList;
    }

    public void setStonesList(List<Stone> stonesList) {
        this.stonesList = stonesList;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    @Override
    public String toString() {
        return "\nNecklace{" +
                "chain = " + chain +
                ", stonesList = " + stonesList +
                '}';
    }
}


