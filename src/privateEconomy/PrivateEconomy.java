package privateEconomy;


import newSeasonNotifier.IToNotify;
import privateEconomy.privSectorFlow.InOutPrivateWealth;
import privateEconomy.privSectorFlow.ResourceProductionOutcome;


public class PrivateEconomy implements IToNotify {
    PrivateEconomyDTO dto = new PrivateEconomyDTO();
    ResourceProductionOutcome resourceProductionOutcome = new ResourceProductionOutcome(dto);

    InOutPrivateWealth inOutPrivateWealth = new InOutPrivateWealth(dto, resourceProductionOutcome);


    public void update() {
        inOutPrivateWealth.calcAllIns();
    }
}
