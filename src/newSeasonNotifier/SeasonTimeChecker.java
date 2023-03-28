package seasonLoader;

import game.time.TIME;
import privateEconomy.ShowCredits;
import utils.patterns.observer.Observer;


public class SeasonTimeChecker {

Observer subsForSeasonStart;

    public SeasonTimeChecker(Observer subsForSeasonStart) {
        this.subsForSeasonStart = subsForSeasonStart;
        this.subsForSeasonStart.addSubscriber(new ShowCredits());

    }

    boolean flag = false;

    public void seasonChanged() {

        if (TIME.days().bitCurrent() != 0) {
            this.flag = true;
        }
        if (TIME.days().bitCurrent() == 0 && this.flag) {
            this.subsForSeasonStart.notifySubscribers();
            this.flag = false;
        }

    }

}
