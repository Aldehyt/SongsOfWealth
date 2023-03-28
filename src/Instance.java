
import privateEconomy.PrivateEconomy;
import script.SCRIPT;
import newSeasonNotifier.*;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;


import java.io.IOException;

public class Instance implements SCRIPT.SCRIPT_INSTANCE {

    SeasonTimeChecker privateEconomyUpdater = new SeasonTimeChecker(new PrivateEconomy());

    public Instance() {

    }

    @Override
    public void update(double v) {
        privateEconomyUpdater.seasonChanged(3.99, 0.2);
    }

    @Override
    public void save(FilePutter filePutter) {
    }

    @Override
    public void load(FileGetter fileGetter) throws IOException {

    }
}
