import privateEconomy.PrivateEconomy;
import script.SCRIPT;
import seasonLoader.ListOfSEnds;
import seasonLoader.SeasonTimeChecker;
import seasonLoader.ShowCredits;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;

import java.io.IOException;

public class Instance implements SCRIPT.SCRIPT_INSTANCE {
    ListOfSEnds listOfSEnds = new ListOfSEnds();
    ShowCredits showCredits = new ShowCredits(listOfSEnds);
    SeasonTimeChecker seasonTimeChecker = new SeasonTimeChecker(listOfSEnds);


    public Instance() {
        PrivateEconomy.getInstance();
    }

    @Override
    public void update(double v) {
        this.seasonTimeChecker.seasonChanged();
    }

    @Override
    public void save(FilePutter filePutter) {
    }

    @Override
    public void load(FileGetter fileGetter) throws IOException {

    }
}
