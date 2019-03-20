package com.threadExperiment;

public class MultiThread {
    public static void main(String[] args) {
        for (int i=0; i<8; i++) {
            new MultithreadingByExtendingThreadClass().start();
            new Thread(new MultiThreadingInJavaByImplementRunnable()).start();
        }
    }
}

