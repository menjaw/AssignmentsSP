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
    public static ArrayBlockingQueue<Long> s1 = new ArrayBlockingQueue(7);
    public static ArrayBlockingQueue<Long> s2 = new ArrayBlockingQueue(7);

    public static void main(String[] args) {
        //print out fibonacci number
        //System.out.println(fibonacci(40));

        //Put data into Arraylist
        for (int i = 0; i < 7; i++) {
            s1.add(new Long(i));
        }

        //Make a Thread (kører alt der ligger i klassen FibonacciProducer)
        Thread p1 = new Thread(new FibonacciProducer());
//        Thread p2 = new Thread(new FibonacciProducer());
//        Thread p3 = new Thread(new FibonacciProducer());
//        Thread p4 = new Thread(new FibonacciProducer());
        p1.start();
//        p2.start();
//        p3.start();
//        p4.start();

    }

}
