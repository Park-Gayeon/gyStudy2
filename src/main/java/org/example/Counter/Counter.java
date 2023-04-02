package org.example.Counter;

public class Counter implements Runnable{
    private int count =0;

    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
    public int getValue(){
        return count;
    }

    @Override
    public void run() {
        synchronized (this) {//counter을 동기화해주는 함수
            this.increment();
            System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue()); //1
            this.decrement();
            System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue()); //0
        }
    }
}
