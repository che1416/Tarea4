/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilo;

/**
 *
 * @author Che
 */
public class lock {
    private boolean esLock = false;

    public synchronized void lock()
            throws InterruptedException {
        while (esLock) {
            wait();
        }
        esLock = true;
    }

    public synchronized void unlock() {
        esLock = false;
        notifyAll();
    }
}
