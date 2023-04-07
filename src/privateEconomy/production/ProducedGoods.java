package privateEconomy.production;

import game.GAME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;
import timeCheckEvery.IUpdatable;

import java.util.ArrayList;

public class ProducedGoods implements IUpdatable {
    @Override
    public void updateMe() {
        loopOverResources();
    }

    public ArrayList<Integer> getAmountOfProducedGoods() {
        return new ArrayList<>();
    }
    public ArrayList<Integer> getPriceOfProducedGoods(){
        return new ArrayList<>();
    }
    public void loopOverResources(){
        int amount = 0;
        for (RESOURCE resource:RESOURCES.ALL()){
            getAmountOfProducedGoods().add(GAME.player().res().inProduced.get(resource));
            getPriceOfProducedGoods().add(GAME.player().credits().pricesBuy.get(resource));
        }

    }
}
