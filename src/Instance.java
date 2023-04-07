
import privateEconomy.privateSector.CalculateIncomeFromProduction;
import privateEconomy.privateSector.ICalculateIncomeFromProduction;
import privateEconomy.production.ICallable;
import privateEconomy.production.IProducedGoods;
import privateEconomy.production.ProducedGoods;
import script.SCRIPT;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;
import timeCheckEvery.SeasonalUpdateChecker;


import java.io.IOException;


public class Instance implements SCRIPT.SCRIPT_INSTANCE {


    public ICallable producedGoods = new ProducedGoods();
    public ICallable calculateIncomeFromProduction = new CalculateIncomeFromProduction((IProducedGoods) producedGoods);
    public SeasonalUpdateChecker seasonalUpdateChecker = new SeasonalUpdateChecker();


    public Instance() {

    }

    @Override
    public void update(double v) {
        seasonalUpdateChecker.intervalChange(producedGoods, calculateIncomeFromProduction);

    }

    @Override
    public void save(FilePutter filePutter) {
    }

    @Override
    public void load(FileGetter fileGetter) throws IOException {

    }
}
