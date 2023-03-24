package seasonLoader;

import java.util.ArrayList;

public class ListOfSEnds {

    private static ListOfSEnds instance;
    public static final ArrayList<ISEnds> myList = new ArrayList<>();

    private ListOfSEnds() {

    }

    ;

    public static ListOfSEnds getInstance() {
        if (instance == null) {
            instance = new ListOfSEnds();
        }
        return instance;
    }

    public static void iterateOverList() {
        for (ISEnds element : myList) {
            element.doJob();
        }
    }

}
