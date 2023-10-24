package Java;

public class BakerySimples {

    private static int globalCounter = 0;
    private static final int NUM_THREADS = 100;
    //private static final int NUM_ITERATIONS = 1000;
    public static void main(String[] args) {
        BakeryLock bakeryLock = new BakeryLock(NUM_THREADS);
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                    System.out.println(threadId);
                    bakeryLock.lock(threadId);
                    //Região Crítica
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
    private boolean[] choosing;
    private int[] number;
    private int numThreads;

    public BakeryLock(int numThreads) {
        this.numThreads = numThreads;
        choosing = new boolean[numThreads];
        number = new int[numThreads];
        for (int i = 0; i < numThreads; i++) {
            choosing[i] = false;
            number[i] = 0;
        }
    }

    public void lock(int threadId) {
        choosing[threadId] = true;
        int maxNumber = 0;
        for (int i = 0; i < numThreads; i++) {
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            }
        }
        number[threadId] = maxNumber + 1;
        choosing[threadId] = false;

        for (int i = 0; i < numThreads; i++) {
            while (choosing[i]) { 
                Thread.yield();/* Aguarde a outra thread escolher. */
            }

            while ((number[i] != 0) && ((number[i] < number[threadId]) || ((number[i] == number[threadId]) && (i < threadId)))) {
                Thread.yield();/*  Espere até que a thread atual seja a próxima na fila. */
            }
        }
    }

    public void unlock(int threadId) {
        number[threadId] = 0;
    }
}
