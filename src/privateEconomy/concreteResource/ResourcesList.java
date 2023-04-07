package privateEconomy.concreteResource;

import game.GAME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;

import java.util.HashMap;
import java.util.Map;

public class ResourcesList {
    private final HashMap<String, ConcreteResource> resourceMap = new HashMap<>();
    private final ConcreteResource concreteResource;

    public ResourcesList(ConcreteResource concreteResource) {
        this.concreteResource = concreteResource;
        fillList();
    }

    public Map<String, ConcreteResource> getResourceMap() {
        return resourceMap;
    }

    private void fillList() {
        for (RESOURCE resource : RESOURCES.ALL()) {
            this.resourceMap.put(resource.key, concreteResource);

        }
    }

}
