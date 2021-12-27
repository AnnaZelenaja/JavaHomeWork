package com.pb.zelenaja.hw13;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();
        Manufacturer manufacturer = new Manufacturer(buffer);
        Consumer consumer = new Consumer(buffer);
        new Thread(manufacturer).start();
        new Thread(consumer).start();

    }
}
class Buffer{
    Queue<Integer> queue = new LinkedList<>();
    public synchronized void get() {
        while (queue.size() <= 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.poll();
        System.out.println("Из буффера потреблено 1 ед.продукции");
        System.out.println("В буффере находится: " + queue.size() + " ед.продукций");
        System.out.println(queue.toString());
        notify();
    }
    public synchronized void put() {
        while (queue.size() >= 5) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add((int) (Math.random() * 10));
        System.out.println("Производителем изготовлена 1 ед.продукции");
        System.out.println("В буффер отправлено: " + queue.size() + " ед.продукций");
        System.out.println(queue.toString());
        notify();

    }
}

class Manufacturer implements Runnable {

    private final Buffer buffer;

    public Manufacturer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (;;) {
            buffer.put();
        }
    }
}

class Consumer implements Runnable {

    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (;;) {
            buffer.get();
        }
    }
}

