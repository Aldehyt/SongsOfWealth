package privateEconomy.privSectorFlow;

import privateEconomy.PrivateEconomyPOJO;



public class InOutPrivateWealth {
    private final PrivateEconomyPOJO privateEconomyPOJO;
    private final IInOut[] args;


    public InOutPrivateWealth(PrivateEconomyPOJO pojo, IInOut... args) {

        this.privateEconomyPOJO = pojo;
        this.args = args;
    }


    public void calcAllIns() {
        double sum = 0;
        for (IInOut source : args) {

            sum += source.results();
            System.out.println("1 " + privateEconomyPOJO.getSummarizedPriceOfAllProducedGoods());
            System.out.println("sum " + sum);
        }
        double wealth = privateEconomyPOJO.getPrivateSectorWealth();
        wealth += sum;
        privateEconomyPOJO.setPrivateSectorWealth(wealth);

    }
}
