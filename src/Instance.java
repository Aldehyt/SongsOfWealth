

import privateEconomy.PrivateEconomyMain;
import script.SCRIPT;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;
import timeCheckEvery.IIntervalChangingRate;
import timeCheckEvery.SeasonalUpdateChecker;
import timeCheckEvery.Updatables;


import java.io.IOException;

public class Instance implements SCRIPT.SCRIPT_INSTANCE {
    PrivateEconomyMain pEcoMain = new PrivateEconomyMain();
    public IIntervalChangingRate seasonalUpdateChecker = new SeasonalUpdateChecker(
            new Updatables(pEcoMain.producedGoods,
                    pEcoMain.calculateIncomeProduction));


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
