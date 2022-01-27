package com.company;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created"+ myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    public Count(Thread myThread) {
        this.myThread = myThread;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println(" printing the count "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("my thread interrupted");
            }
            System.out.println("my thread rus is over");

        }
    }
}
