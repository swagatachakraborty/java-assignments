package com.threadExperiment;
// Java code for thread creation by extending the Thread class
class MultithreadingByExtendingThreadClass extends Thread
{
    public void run()
    {
        try
        {
            System.out.println ("Thread which extends Thread of id " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}
