package seasonLoader;

import java.util.ArrayList;

public class ListOfSEndsManipulator {

    public static final ArrayList<ISEnds> listOfSEnds = new ArrayList<>();

    public void executeOverList(){
        for(ISEnds element : listOfSEnds){
            element.doJob();
        }
    }

}
