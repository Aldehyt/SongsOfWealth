package seasonLoader;

import utils.patterns.observer.Subscriber;

public class ShowCredits extends Subscriber {


    @Override
    public void notified() {
        super.notified();
        doJob();
    }

    public void doJob() {
        System.out.println("Job is done in: " + this.getClass());
    }
}
