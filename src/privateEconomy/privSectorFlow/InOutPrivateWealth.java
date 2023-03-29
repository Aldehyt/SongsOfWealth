package privateEconomy.privSectorFlow;

import privateEconomy.PrivateEconomyPOJO;



public class InOutPrivateWealth {
    private final PrivateEconomyPOJO pojo;
    private final IInOut[] args;

    public InOutPrivateWealth(PrivateEconomyPOJO pojo, IInOut... args) {

        this.pojo = pojo;
        this.args = args;
    }

    public void calcAllIns() {
        double sum = 0;
        for (IInOut source : args) {

            sum += source.results();
        }
        pojo.setPrivateSectorWealth(pojo.getPrivateSectorWealth() + sum);
        System.out.println("Your population increased private wealth to: " + pojo.getPrivateSectorWealth() + " and you payed them: " + pojo.getPayouts() + " in this season");
    }
}
