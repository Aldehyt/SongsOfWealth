package privateEconomy;

public class PrivateEconomyPOJO {
    private double privateSectorWealth;
    private double producedResources;
    private double summarizedPriceOfAllProducedGoods;
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

    public double getSummarizedPriceOfAllProducedGoods() {
        return summarizedPriceOfAllProducedGoods;
    }

    public void setSummarizedPriceOfAllProducedGoods(double producedResourcesPrice) {
        this.summarizedPriceOfAllProducedGoods = producedResourcesPrice;
    }
}
