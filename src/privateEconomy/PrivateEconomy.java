package privateEconomy;


import newSeasonNotifier.IToNotify;
import privateEconomy.privSectorFlow.InOutPrivateWealth;
import privateEconomy.privSectorFlow.PaymentIncome;
import privateEconomy.privSectorFlow.PriceOfProducedGoods;


public class PrivateEconomy implements IToNotify {
    PrivateEconomyPOJO pojo = new PrivateEconomyPOJO();
    PriceOfProducedGoods resourceProductionIncome = new PriceOfProducedGoods(pojo);
    PaymentIncome paymentIncome = new PaymentIncome(pojo);

    InOutPrivateWealth inOutPrivateWealth = new InOutPrivateWealth(pojo, resourceProductionIncome, paymentIncome);



    public void update() {
        inOutPrivateWealth.calcAllIns();
    }
}
