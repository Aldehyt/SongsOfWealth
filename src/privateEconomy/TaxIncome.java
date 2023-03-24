package privateEconomy;

public class TaxIncome {
	private Variables variables;

	public TaxIncome(Variables variables){
		this.variables = variables;
	}
	public void applyTaxes() {
		this.variables.setTaxedIncome(this.variables.getProducedResourcesPrice() * this.variables.getTax());
		System.out.println("Income from taxes: " + this.variables.getTaxedResources());
	}
	
}
