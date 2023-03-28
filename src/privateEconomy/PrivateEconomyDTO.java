package privateEconomy;

public class PrivateEconomyDTO {
    private double privateSectorWealth;
    private double producedResources;
    private double producedResourcesPrice;
    private double taxRate;

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getPrivateSectorWealth() {
        return privateSectorWealth;
    }

    // Should be use only once
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
