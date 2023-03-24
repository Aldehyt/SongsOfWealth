package seasonLoader;

public class ShowCredits extends AbPutter implements ISEnds{
    public ShowCredits(ListOfSEnds listOfSEnds) {
        super(listOfSEnds);
    }

    @Override
    public void doJob() {
        System.out.println("Credits $$$");

    }
}
