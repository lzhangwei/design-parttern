package design_pattern.observer_pattern;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("二进制：" + Integer.toBinaryString(subject.getState()));
    }
}
