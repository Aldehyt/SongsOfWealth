/**
 * Założenia:
 *
 */



package privateEconomy;


import newSeasonNotifier.IToNotify;
import privateEconomy.privSectorFlow.Payment;

public class PrivateEconomy implements IToNotify {
public double privateSectorCredits;

    PriceOfProducedGoods resourceProductionIncome = new PriceOfProducedGoods();
    Payment paymentIncome = new Payment(resourceProductionIncome);
    WealthFlow privateSectorWealthIncome = new WealthFlow(resourceProductionIncome, paymentIncome);




    public void update() {
        paymentIncome.addPayoffPerRaceToDict(); // 0
        resourceProductionIncome.summarizePriceOfAllProducedGoods(); // 1
        paymentIncome.sumPayoffsOfAllRaces(); // 2
        privateSectorWealthIncome.sumAllSourcesOfWealth(); // 3
        privateSectorCredits += privateSectorWealthIncome.results(); // 4
    }
}
