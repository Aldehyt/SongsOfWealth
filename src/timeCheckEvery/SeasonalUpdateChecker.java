package timeCheckEvery;

import game.time.TIME;

public class SeasonalUpdateChecker implements IIntervalChangingRate{


    private final Updatables updatables;

    public SeasonalUpdateChecker(Updatables updatables) {

        this.updatables = updatables;
    }

    boolean flag = false;

    public void intervalChange() {
        double seasonStart = 3.99;
        double seasonEnd = 0.1;
        if (TIME.days().bitOfSeason() > seasonStart && !this.flag) {
            updatables.objectsToUpdate();
            this.flag = true;
        }
        if (TIME.days().bitOfSeason() < seasonEnd && this.flag) {
            this.flag = false;

        }
    }
}
