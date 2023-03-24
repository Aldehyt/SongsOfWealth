
import script.SCRIPT;
import seasonLoader.ListOfSEnds;
import seasonLoader.SeasonTimeChecker;
import seasonLoader.ShowCredits;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;

import java.io.IOException;

public class Instance implements SCRIPT.SCRIPT_INSTANCE {


    SeasonTimeChecker seasonTimeChecker = new SeasonTimeChecker();
    ListOfSEnds listOfSEnds = ListOfSEnds.getInstance();
    static ShowCredits showCredits = new ShowCredits();

    public Instance() {

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
