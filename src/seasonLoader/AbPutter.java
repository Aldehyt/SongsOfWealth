package seasonLoader;

public abstract class AbPutter implements ISEnds{
     public ListOfSEnds listOfSEnds;

    public AbPutter(ListOfSEnds listOfSEnds) {

        this.listOfSEnds = listOfSEnds;
        this.registerMe();
    }
    public void registerMe(){
        listOfSEnds.listOfSEnds.add(this);
    }
}
