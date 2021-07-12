package tdd;

import java.util.PriorityQueue;

public class Queue {

    PriorityQueue pq;

    public Queue() {
        this.pq = new PriorityQueue<Object>();
    }

    public void enqueue(Object object){
        pq.add(object);
    }
}
