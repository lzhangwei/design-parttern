package design_pattern.observer_pattern;

public class ObserverPatternTest {
    public static void main(String args[]) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("十进制: 10");
        subject.setState(10);

        System.out.println("......\n十进制: 15");
        subject.setState(15);
    }
}
