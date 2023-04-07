

import privateEconomy.privateSector.CalculateIncomeFromProduction;
import privateEconomy.production.ProducedGoods;
import script.SCRIPT;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;
import timeCheckEvery.IIntervalChangingRate;
import timeCheckEvery.SeasonalUpdateChecker;
import timeCheckEvery.Updatables;


import java.io.IOException;

public class Instance implements SCRIPT.SCRIPT_INSTANCE {

    public IIntervalChangingRate seasonalUpdateChecker = new SeasonalUpdateChecker(
            new Updatables(new CalculateIncomeFromProduction(new ProducedGoods())));


    public Instance() {

    }

    @Override
    public void update(double v) {
        seasonalUpdateChecker.intervalChange();

    }

    @Override
    public void save(FilePutter filePutter) {
    }

    @Override
    public void load(FileGetter fileGetter) throws IOException {

    }
}
