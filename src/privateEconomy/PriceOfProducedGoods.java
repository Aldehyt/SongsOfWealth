package privateEconomy;

import game.GAME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;
import privateEconomy.privSectorFlow.IInOutSourceOfWealth;


public class PriceOfProducedGoods implements IInOutSourceOfWealth {
private double summarizedPriceOfAllProducedGoods;


    @Override
    public double results() {
        return summarizedPriceOfAllProducedGoods;
    }
    public void summarizePriceOfAllProducedGoods(){
        for (RESOURCE res : RESOURCES.ALL()) {
            summarizedPriceOfAllProducedGoods += GAME.player().credits().pricesSell.get(res) * GAME.player().res().inProduced.get(res);
        }
    }

}
