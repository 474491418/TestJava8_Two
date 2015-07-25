package edu.sust.test.Observer_Pattern;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 * 使用jdk自带的观察者模式
 */
public class Boss extends Observable {
    private int dest = 10;
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void close(int dest_T) {
        dest = dest - dest_T;
        this.setChanged();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }


}
