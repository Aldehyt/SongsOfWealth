package timeCheckEvery;

import game.time.TIME;
import javafx.util.Pair;
import privateEconomy.production.ICallable;
import privateEconomy.production.ProducedGoods;

import java.util.ArrayList;
import java.util.function.Function;

public class SeasonalUpdateChecker {
    public SeasonalUpdateChecker() {

    }

    boolean flag = false;

    public void intervalChange(ICallable... args) {
        double seasonStart = 3.99;
        double seasonEnd = 0.1;
        if (TIME.days().bitOfSeason() > seasonStart && !this.flag) {
            for(ICallable ele: args){
                ele.call();
            }
            this.flag = true;
        }
        if (TIME.days().bitOfSeason() < seasonEnd && this.flag) {
            this.flag = false;

        }
    }

}
