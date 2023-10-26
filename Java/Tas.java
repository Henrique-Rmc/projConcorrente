package Java;

import java.util.concurrent.atomic.AtomicBoolean;

public class Tas {
    //private static int globalCounter = 0;
    private static int NUM_THREADS;

    public static void main(String[] args) {
        NUM_THREADS = Integer.parseInt(args[0]);

        TasLock tasLock = new TasLock();
        
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                    //System.out.println(threadId);
                    tasLock.lock();
                    //Região Crítica
                    //globalCounter++;
                    //Fim Região Crítica
                    tasLock.unlock();
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

        //System.out.println("Shared Counter: " + globalCounter);
    }
}

class TasLock {
    private AtomicBoolean Trava;
    public TasLock(){
        this.Trava = new AtomicBoolean(false);
    }

    public void lock(){
        while(!Trava.getAndSet(true)){
            
        }
    }

    public void unlock(){
        Trava.set(false);
    }

}