/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Menja
 */
public class Main {

    //Make an Arralist (ArrayBlockingQueue)
    public static ArrayBlockingQueue<Long> s1 = new ArrayBlockingQueue(11);
    public static ArrayBlockingQueue<Long> s2 = new ArrayBlockingQueue(11);

    public static void main(String[] args) {
        //print out fibonacci number
        //System.out.println(fibonacci(40));

        //Put data into Arraylist
        s1.add(new Long(4));
        s1.add(new Long(5));
        s1.add(new Long(8));
        s1.add(new Long(12));
        s1.add(new Long(21));
        s1.add(new Long(22));
        s1.add(new Long(34));
        s1.add(new Long(35));
        s1.add(new Long(36));
        s1.add(new Long(37));
        s1.add(new Long(42));
      

    
        //Make a Thread (kører alt der ligger i klassen FibonacciProducer)
        Thread p1 = new Thread(new FibonacciProducer());
        Thread p2 = new Thread(new FibonacciProducer());
        Thread p3 = new Thread(new FibonacciProducer());
        Thread p4 = new Thread(new FibonacciProducer());
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    
}

}
