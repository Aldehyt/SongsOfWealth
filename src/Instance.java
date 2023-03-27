
import script.SCRIPT;
import seasonLoader.*;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;
import utils.patterns.observer.Observer;

import java.io.IOException;

public class Instance implements SCRIPT.SCRIPT_INSTANCE {

    SeasonTimeChecker seasonTimeChecker = new SeasonTimeChecker(new Observer());

    public Instance() {

    }

    @Override
    public void update(double v) {
        seasonTimeChecker.seasonChanged();
    }

    @Override
    public void save(FilePutter filePutter) {
    }

    @Override
    public void load(FileGetter fileGetter) throws IOException {

    }
}
