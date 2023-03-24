package privateEconomy;

public class PrivateEconomy {

    private static PrivateEconomy instance;
    private double privateSectorCredits;

    private PrivateEconomy(){}
    public static PrivateEconomy getInstance(){
        if(instance == null){
            instance = new PrivateEconomy();
        }
        return instance;
    }

    public double getPrivateSectorCredits() {
        return privateSectorCredits;
    }
    public void setPrivateSectorCredits(double privateSectorCredits){
        this.privateSectorCredits = privateSectorCredits;
    }
}
