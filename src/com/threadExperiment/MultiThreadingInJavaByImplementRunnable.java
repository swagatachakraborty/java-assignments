package com.threadExperiment;
// Java code for thread creation by implementing the Runnable Interface

class MultiThreadingInJavaByImplementRunnable implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println ("Thread which implements Runnable of id " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}