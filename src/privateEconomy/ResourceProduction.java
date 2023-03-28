package privateEconomy;

import game.GAME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;

public class ResourceProduction {

    private final PrivateEconomyDTO dto;

    public ResourceProduction(PrivateEconomyDTO dto) {

        this.dto = dto;
    }

    public void calcProduction() {
        double resourcesSUM = 0;
        double resourcePrice = 0;
        for (RESOURCE res : RESOURCES.ALL()) {
            resourcesSUM += GAME.player().res().inProduced.get(res);
            resourcePrice += GAME.player().credits().pricesSell.get(res) * GAME.player().res().inProduced.get(res);


        }
        this.dto.setProducedResources(resourcesSUM);
        this.dto.setProducedResourcesPrice(resourcePrice);
        System.out.println("Produced: " + dto.getProducedResources() + " Price summary: " + dto.getProducedResourcesPrice());

    }
}
