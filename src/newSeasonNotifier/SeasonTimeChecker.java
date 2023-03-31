package newSeasonNotifier;

import game.time.TIME;


public class SeasonTimeChecker {

    private final IToNotify iToNotify;
    boolean flag = false;

    public SeasonTimeChecker(IToNotify iToNotify) {
        this.iToNotify = iToNotify;
    }


    public void seasonChanged(double seasonEndCheck, double seasonStartCheck) {

        if (TIME.days().bitOfSeason() > seasonEndCheck && !this.flag) {
            iToNotify.update();
            this.flag = true;
        }
        if (TIME.days().bitOfSeason() < seasonStartCheck && this.flag) {
            this.flag = false;

        }

    }
}
