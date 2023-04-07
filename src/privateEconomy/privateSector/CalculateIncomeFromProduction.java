package privateEconomy.privateSector;

import javafx.util.Pair;
import privateEconomy.production.ICallable;
import privateEconomy.production.IProducedGoods;

import java.util.ArrayList;

public class CalculateIncomeFromProduction implements ICallable, ICalculateIncomeFromProduction {


    private final IProducedGoods producedGoods;

    public CalculateIncomeFromProduction(IProducedGoods producedGoods) {
        this.producedGoods = producedGoods;
    }

    public double wholeIncome() {
        Pair<ArrayList<Integer>, ArrayList<Integer>> pair = producedGoods.getProducedGoods();
        double wholeIncome = 0;
        for (int i = 0; i < pair.getKey().size(); i++) {
            wholeIncome += pair.getKey().get(i) * pair.getValue().get(i);
        }
        System.out.println(this.getClass() + " - wholeIncome: " + wholeIncome);
        return wholeIncome;
    }

    @Override
    public void call() {
        wholeIncome();
    }
}
