package org.example.Counter;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter(); // 싱글톤 객체에서 상태를 유지하게 설계를 하면 안됨. multi thread 환경에서 하나의 자원(Counter)을 공유하게 되면 뜻하지 않은 결과물을 가져옴
                                        //동기화를 사용하면 쉽게 해결 할 수 있음.
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
