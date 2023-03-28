package privateEconomy;


import newSeasonNotifier.IToNotify;


public class PrivateEconomy implements IToNotify {
        PrivateEconomyDTO dto = new PrivateEconomyDTO();
        ResourceProduction resourceProduction = new ResourceProduction(dto);

    public void update(){
        resourceProduction.calcProduction();

    }
}
