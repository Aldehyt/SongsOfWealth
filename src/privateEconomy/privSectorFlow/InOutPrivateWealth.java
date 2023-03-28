package privateEconomy.privSectorFlow;

import privateEconomy.IInOut;
import privateEconomy.PrivateEconomyDTO;

import java.util.ArrayList;
import java.util.Arrays;

public class InOutPrivateWealth {
    private final PrivateEconomyDTO dto;
    private final IInOut[] args;

    public InOutPrivateWealth(PrivateEconomyDTO dto, IInOut... args) {

        this.dto = dto;
        this.args = args;
    }

    public void calcAllIns() {

        double sum = 0;
        for (IInOut source : args) {
            sum += source.results();
        }
        double wealth = dto.getPrivateSectorWealth();
        wealth += sum;
        dto.setPrivateSectorWealth(wealth);
        System.out.println("Private sector Wealth: " + dto.getPrivateSectorWealth());
    }
}
