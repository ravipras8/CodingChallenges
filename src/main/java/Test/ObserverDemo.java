package Test;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject s = new Subject();
        new OneObserver(s);
        new TwoObserver(s);
        s.setData("hi");
    }
}
class Subject{
    String msg;
    List<Observer> list = new ArrayList<>();
    public void setData(String msg){
        this.msg= msg;
        publishAll();
    }
    public void publishAll(){
        for (Observer observer : list) {
            observer.subscribedData();;
        }
    }
}
abstract class Observer{
    public Subject subject;
    public abstract void subscribedData();
}
class OneObserver extends Observer{
    public OneObserver(Subject subject){
    this.subject=subject;
    this.subject.list.add(this);
    }
    public void subscribedData(){
        System.out.println("one:"+subject.msg);
    }
}
class TwoObserver extends Observer{
    public TwoObserver(Subject subject){
        this.subject=subject;
        this.subject.list.add(this);
        }
    public void subscribedData(){
        System.out.println("Two:"+subject.msg);
    }
}