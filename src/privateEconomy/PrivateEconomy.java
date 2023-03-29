/**
 * Założenia:
 *
 */



package privateEconomy;


import newSeasonNotifier.IToNotify;
import privateEconomy.privSectorFlow.InOutPrivateWealth;
import privateEconomy.privSectorFlow.Payment;
import privateEconomy.privSectorFlow.PriceOfProducedGoods;


public class PrivateEconomy implements IToNotify {
    PrivateEconomyPOJO pojo = new PrivateEconomyPOJO();
    PriceOfProducedGoods resourceProductionIncome = new PriceOfProducedGoods(pojo);
    Payment paymentIncome = new Payment(pojo);

    // All incomes and outcomes of private sector wealth, must be added in constructor below
    InOutPrivateWealth inOutPrivateWealth = new InOutPrivateWealth(pojo, resourceProductionIncome, paymentIncome);



    public void update() {

        // Here's an updated change of season, including all calculations such as economic data updates.
        inOutPrivateWealth.calcAllIns();
    }
}
