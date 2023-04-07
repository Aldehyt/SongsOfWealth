package timeCheckEvery;

public class Updatables {

    private final IUpdatable[] updatableArgs;

    public Updatables(IUpdatable... updatableArgs){

        this.updatableArgs = updatableArgs;
    }
    public void objectsToUpdate(){
        for (IUpdatable updatable : this.updatableArgs) {
            updatable.updateMe();
        }
    }
}
