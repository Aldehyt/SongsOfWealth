package privateEconomy.concreteResource;

public class ConcreteResource{
    private int increaseTaxBy;
    private int decreaseTaxBy;
    private int currentTax;


    public ConcreteResource(int increaseTaxBy, int decreaseTaxBy, int currentTax){

        this.increaseTaxBy = increaseTaxBy;
        this.decreaseTaxBy = decreaseTaxBy;
        this.currentTax = currentTax;


    }
    public int getCurrentTax() {
        return currentTax;
    }

    public void setCurrentTax(int currentTax) {
        this.currentTax = currentTax;
    }

    public int getDecreaseTaxBy() {
        return decreaseTaxBy;
    }

    public void setDecreaseTaxBy(int decreaseTaxBy) {
        this.decreaseTaxBy = decreaseTaxBy;
    }

    public int getIncreaseTaxBy() {
        return increaseTaxBy;
    }

    public void setIncreaseTaxBy(int increaseTaxBy) {
        this.increaseTaxBy = increaseTaxBy;
    }
}
