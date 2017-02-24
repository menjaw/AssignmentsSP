/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Menja
 */
public class FibonacciProducer implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < Main.s1.size(); i++) {
            try {
                //Tager værdierne fra s1 og tilføjer dem til s2
                Main.s2.add(fibonacci(Main.s1.take()));
            } catch (InterruptedException ex) {
                Logger.getLogger(FibonacciProducer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(Main.s1);
        System.out.println(Main.s2);
    }

    //Method: Fibonacci Calculater
    private Long fibonacci(Long fibonacciLength) {
        if (fibonacciLength == 0 || fibonacciLength == 1) {
            return fibonacciLength;
        }
        return fibonacci(fibonacciLength - 1) + fibonacci(fibonacciLength - 2);

    }
}
