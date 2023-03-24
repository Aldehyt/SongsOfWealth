package seasonLoader;

import java.util.Arrays;

public class ListOfSEndsLoader {

    private final ISEnds[] args;

    public ListOfSEndsLoader(ISEnds... args){
        this.args = args;
        loadIntoList();
    }
    private void loadIntoList(){
        ListOfSEnds.myList.addAll(Arrays.asList(args));
    }
}
