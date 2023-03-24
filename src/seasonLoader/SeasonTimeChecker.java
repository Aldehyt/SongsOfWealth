package seasonLoader;

import game.time.TIME;


public class SeasonTimeChecker {

    boolean flag = false;

    public void seasonChanged() {

        if (TIME.days().bitCurrent() != 0) {
            this.flag = true;
        }
        if (TIME.days().bitCurrent() == 0 && this.flag) {
            ListOfSEnds.iterateOverList();
            this.flag = false;
        }

    }

}
