import java.util.ArrayList;

public class ThreadSafeList {

    private ArrayList<String> list;

    public ThreadSafeList() {
        list = new ArrayList<>();
    }

    public synchronized void addElement(String element) {
        list.add(element);
    }

    public synchronized int getSize() {
        return list.size();
    }

    public synchronized boolean removeElement(String element) {
        return list.remove(element);
    }
}