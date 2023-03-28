package privateEconomy;

public class PrivateEconomyDTO {
    private double privateSectorWealth;
    private double producedResources;
    private double producedResourcesPrice;

    public double getPrivateSectorWealth() {
        return privateSectorWealth;
    }

    public void setPrivateSectorWealth(double privateSectorWealth) {
        this.privateSectorWealth = privateSectorWealth;
    }

    public double getProducedResources() {
        return producedResources;
    }

    public void setProducedResources(double producedResources) {
        this.producedResources = producedResources;
    }

    public double getProducedResourcesPrice() {
        return producedResourcesPrice;
    }

    public void setProducedResourcesPrice(double producedResourcesPrice) {
        this.producedResourcesPrice = producedResourcesPrice;
    }
}
