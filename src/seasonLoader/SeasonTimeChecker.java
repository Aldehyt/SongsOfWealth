package seasonLoader;

import game.time.TIME;


public class SeasonTimeChecker {
    boolean flag = false;
    private ListOfSEnds listOfSEnds;

    public SeasonTimeChecker(ListOfSEnds listOfSEnds) {

        this.listOfSEnds = listOfSEnds;
    }

    public void seasonChanged() {

        if (TIME.days().bitCurrent() != 0) {
            this.flag = true;

        }

        if (TIME.days().bitCurrent() == 0 && this.flag) {
            this.listOfSEnds.executeOverList();
            this.flag = false;
        }

    }

}
