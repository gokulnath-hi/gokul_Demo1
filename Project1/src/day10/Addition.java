package day10;

import java.util.*;
class Addition implements Runnable {
    int a;
    public Addition(int a) 
    {
        this.a = a;
    }
    public void run() 
    {
        addRandom();
    }

    public void addRandom() {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        for(int i=0;i<5;i++)
        {
        System.out.println("Thread being generated: "+ n);
        }
        synchronized (this)
        {
            a += n;
        }
        
        
    }
}
