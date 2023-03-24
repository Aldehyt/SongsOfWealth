package privateEconomy;

public class Variables {
	private boolean FLAG_resource_counted = false;
	private double privateSectorWholeWealth;
	private double producedResource, resourcePrice;
	private double producedResourcesPrice = 0;
	private double sumOfproducedResources = 0;
	private double tax = 0.1;
	private double taxedResources;
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getSumOfPResources() {
		return sumOfproducedResources;
	}
	public void setSumPResources(double sumOfproducedResources) {
		this.sumOfproducedResources = sumOfproducedResources;
	}
	public double getProducedResourcesPrice() {
		return producedResourcesPrice;
	}
	public void setProducedResourcesPrice(double producedResourcesPrice) {
		this.producedResourcesPrice = producedResourcesPrice;
	}
	public double getProducedResource() {
		return producedResource;
	}
	public void setProducedResource(double producedResource) {
		this.producedResource = producedResource;
	}
	public double getResourcePrice() {
		return resourcePrice;
	}
	public void setRPrice(double resourcePrice) {
		this.resourcePrice = resourcePrice;
	}
	public double getPrivateSectorWholeWealth() {
		return privateSectorWholeWealth;
	}
	public void setPrivateSectorWholeWealth(double privateSectorWholeWealth) {
		this.privateSectorWholeWealth = privateSectorWholeWealth;
	}
	public boolean isFLAG_resource_counted() {
		return FLAG_resource_counted;
	}
	public void setFLAG_resource_counted(boolean fLAG_resource_counted) {
		FLAG_resource_counted = fLAG_resource_counted;
	}

	public double getTaxedResources() {
		return taxedResources;
	}

	public void setTaxedIncome(double taxedResources) {
		this.taxedResources = taxedResources;
	}
}
