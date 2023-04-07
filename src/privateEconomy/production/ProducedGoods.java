package privateEconomy.production;

import game.GAME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;
import javafx.util.Pair;

import java.util.ArrayList;

public class ProducedGoods implements ICallable, IProducedGoods {


    public Pair<ArrayList<Integer>, ArrayList<Integer>> getProducedGoods() {
        ArrayList<Integer> getAmountOfProducedGoods = new ArrayList<>();
        ArrayList<Integer> getPriceOfProducedGoods = new ArrayList<>();
        for (RESOURCE resource : RESOURCES.ALL()) {
            getAmountOfProducedGoods.add(GAME.player().res().inProduced.get(resource));
            getPriceOfProducedGoods.add(GAME.player().credits().pricesBuy.get(resource));
        }
        System.out.println(this.getClass() + " - getAmountOfProducedGoods: " + getAmountOfProducedGoods);
        System.out.println(this.getClass() + " - getPriceOfProducedGoods: " + getPriceOfProducedGoods);
        return new Pair<>(getAmountOfProducedGoods, getPriceOfProducedGoods);
    }

    @Override
    public void call() {
        getProducedGoods();
    }
}
