package design_pattern.observer_pattern;

import com.google.common.collect.Lists;

import java.util.List;

public class Subject {
    private List<Observer> observerList = Lists.newArrayList();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObserver() {
        observerList.forEach(Observer::update);
    }
}
