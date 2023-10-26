package Java;

import java.util.concurrent.atomic.AtomicBoolean;

public class Ttas {
    //private static int globalCounter = 0;
    private static int NUM_THREADS;

    public static void main(String[] args) {
        NUM_THREADS = Integer.parseInt(args[0]);

        TtasLock ttasLock= new TtasLock();
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            //final int threadId = i;
            threads[i] = new Thread(() -> {
                    //System.out.println(threadId);
                    ttasLock.lock();
                    //Região Crítica
                    //globalCounter++;
                    //Fim Região Crítica
                    ttasLock.unlock();
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

class TtasLock {
    private AtomicBoolean Trava;
    public TtasLock(){
        this.Trava = new AtomicBoolean(false);
    }

    public void lock(){
        while(!Trava.get()){
            if(!Trava.getAndSet(true)){
                break;
            }
        }
    }

    public void unlock(){
        Trava.set(false);
    }

}
