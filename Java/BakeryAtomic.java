package Java;

import java.util.concurrent.atomic.AtomicIntegerArray;


public class BakeryAtomic {
    private static int globalCounter = 0;
    private static int NUM_THREADS;
    public static void main(String[] args) {
        NUM_THREADS = Integer.parseInt(args[0]);

        BakeryLock bakeryLock = new BakeryLock(NUM_THREADS);
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                    System.out.println(threadId);
                    bakeryLock.lock(threadId);
                    //Região Crítica
                    System.out.println(threadId);
                    globalCounter++;
                    //Fim Região Crítica
                    bakeryLock.unlock(threadId);
            });
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Shared Counter: " + globalCounter);
    }
}



class BakeryLock {
    
    private AtomicIntegerArray choosing;
    private AtomicIntegerArray number;
    private int numThreads;


    public BakeryLock(int numThreads) {
        this.numThreads = numThreads;
        choosing = new AtomicIntegerArray(numThreads); // 0:False | 1:True
        number = new AtomicIntegerArray(numThreads) ;
    
    }

    public void lock(int threadId) {
        //Choosing ticket
        choosing.set(threadId, 1);
        int maxNumber = 0;
        for (int i = 0; i < numThreads; i++) {
            if (number.get(i) > maxNumber) {
                maxNumber = number.get(i);
            }
        }
        number.set(threadId, maxNumber+1);
        choosing.set(threadId, 0);

        //Verificação
        for (int i2 = 0; i2 < numThreads; i2++) {
            while (choosing.get(i2)==1) { 
                Thread.yield();/* Aguarde a outra thread escolher. */}

            while ((number.get(i2)!=0) && ((number.get(i2) < number.get(threadId)) || ((number.get(i2) == number.get(threadId)) && (i2 < threadId)))) {
                Thread.yield();/*  Espere até que a thread atual seja a próxima na fila. */
            }
        } 
    }

    public void unlock(int threadId) {
        number.set(threadId, 0);
    }
}
