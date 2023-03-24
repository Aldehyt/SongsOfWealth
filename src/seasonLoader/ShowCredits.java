package seasonLoader;

public class ShowCredits implements ISEnds {

    public ShowCredits() {
        System.out.println(" ShowCredits class - created");
        registerMe();
    }

    @Override
    public void doJob() {
        System.out.println("Credits $$$");

    }

    private void registerMe() {
        ListOfSEnds.myList.add(this);
    }
}
