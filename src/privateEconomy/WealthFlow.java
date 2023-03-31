package privateEconomy;

import privateEconomy.privSectorFlow.IInOutSourceOfWealth;


public class WealthFlow {
    public final IInOutSourceOfWealth[] sourceOfWealths;
    private double sumAllSourcesOfWealth;
    public WealthFlow(IInOutSourceOfWealth... sourceOfWealths) {
        this.sourceOfWealths = sourceOfWealths;
    }
    public void sumAllSourcesOfWealth() {
        for (IInOutSourceOfWealth source : sourceOfWealths) {

            sumAllSourcesOfWealth += source.results();
        }
    }
    public double results(){
        return sumAllSourcesOfWealth;
    }

}
