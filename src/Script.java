import script.SCRIPT;

public class Script implements SCRIPT {
    @Override
    public CharSequence name() {
        return "Songs Of Wealth - IntelliJ";
    }

    @Override
    public CharSequence desc() {
        return null;
    }

    @Override
    public void initBeforeGameCreated() {

    }

    @Override
    public SCRIPT_INSTANCE initAfterGameCreated() {
        return new Instance();
    }
}
