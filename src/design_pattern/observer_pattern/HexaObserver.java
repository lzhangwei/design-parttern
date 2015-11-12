package design_pattern.observer_pattern;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("六进制：" + Integer.toHexString(subject.getState()));
    }
}
