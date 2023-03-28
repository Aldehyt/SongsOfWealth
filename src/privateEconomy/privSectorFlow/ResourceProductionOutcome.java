package privateEconomy.privSectorFlow;

import game.GAME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;
import privateEconomy.IInOut;
import privateEconomy.PrivateEconomyDTO;

public class ResourceProductionOutcome implements IInOut {

    private final PrivateEconomyDTO dto;

    public ResourceProductionOutcome(PrivateEconomyDTO dto) {

        this.dto = dto;
    }

    public double calcProduction() {
        double resourcePrice = 0;
        for (RESOURCE res : RESOURCES.ALL()) {
            resourcePrice += GAME.player().credits().pricesSell.get(res) * GAME.player().res().inProduced.get(res);

        }
//        this.dto.setProducedResourcesPrice(resourcePrice);
        return resourcePrice;
    }

    @Override
    public double results() {
        return calcProduction();
    }
}
