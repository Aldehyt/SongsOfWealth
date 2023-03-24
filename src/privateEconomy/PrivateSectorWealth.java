package privateEconomy;

import game.GAME;
import game.time.TIME;
import init.resources.RESOURCE;
import init.resources.RESOURCES;

public class PrivateSectorWealth{
	Variables variables;
	private TaxIncome taxIncome;


 public PrivateSectorWealth(Variables variables, TaxIncome taxIncome){
	 this.variables = variables;
	 this.taxIncome = taxIncome;
 }
 public double getPrivateSectorWholeWealth() {
	 return this.variables.getPrivateSectorWholeWealth();
 }
 public void setPrivateSectorWholeWealth(double wealth) {
	 this.variables.setPrivateSectorWholeWealth(wealth);
 }

 public void calcIncomeForSeason(){
	 if(TIME.days().bitOfSeason() > 3.9 && this.variables.isFLAG_resource_counted() == false) {
		 for(RESOURCE res : RESOURCES.ALL()) {
			 this.variables.setRPrice(GAME.player().credits().pricesSell.get(res));
			 this.variables.setProducedResource(GAME.player().res().inProduced.get(res));
			 this.variables.setSumPResources(this.variables.getSumOfPResources() + this.variables.getProducedResource());
			 this.variables.setProducedResourcesPrice(this.variables.getProducedResourcesPrice() + this.variables.getProducedResource() * this.variables.getResourcePrice());
		 }
		 this.variables.setPrivateSectorWholeWealth(this.variables.getPrivateSectorWholeWealth() + this.variables.getProducedResourcesPrice());

		 System.out.println("Produced resource in this season: " + this.variables.getSumOfPResources() + " Value of produced resources are: " + this.variables.getProducedResourcesPrice());
		 System.out.println("Private sector wealth: " + this.variables.getPrivateSectorWholeWealth());

		 this.taxIncome.applyTaxes();
		 this.variables.setFLAG_resource_counted(true);
		 this.variables.setSumPResources(0);
		 this.variables.setProducedResourcesPrice(0);
	}
 }
}
