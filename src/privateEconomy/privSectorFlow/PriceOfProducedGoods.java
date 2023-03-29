package privateEconomy.privSectorFlow;

import game.GAME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;
import privateEconomy.PrivateEconomyPOJO;

/**
 * Klasa ta oblicza sumaryczną cenę wszystkich wyprodukowanych dóbr.
 * This class calculates the total price of all produced goods.
 */
public class PriceOfProducedGoods implements IInOut {
    private final PrivateEconomyPOJO pojo;


    public PriceOfProducedGoods(PrivateEconomyPOJO pojo) {
        this.pojo = pojo;
    }

    /**
     * Iteruje się po wszystkich zasobach, mnożąc każdy zasób w odpowiadającą mu ceną i je wszystkie sumuje,
     * zwracajac wynik.
     * It iterates through all the resources, multiplying each resource into its corresponding price and sums them all up, returning the result.
     */

    @Override
    public double results() {
        double summarizedPriceOfAllProducedGoods = 0;
        for (RESOURCE res : RESOURCES.ALL()) {
            summarizedPriceOfAllProducedGoods += GAME.player().credits().pricesSell.get(res) * GAME.player().res().inProduced.get(res);
        }

        pojo.setSummarizedPriceOfAllProducedGoods(pojo.getSummarizedPriceOfAllProducedGoods() + summarizedPriceOfAllProducedGoods);
        return pojo.getSummarizedPriceOfAllProducedGoods();
    }

}
