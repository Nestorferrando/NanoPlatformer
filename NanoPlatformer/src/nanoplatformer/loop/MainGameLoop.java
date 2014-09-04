/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.loop;

/**
 *
 * @author Nestor
 */
public class MainGameLoop extends Thread {

    private static final int FRAMES_PER_SECOND=30;
    private static final long MS_BETWEEN_FRAMES=1000/FRAMES_PER_SECOND;
    
    private boolean running=true;
    
    public MainGameLoop() {
        
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Win")) {
            createTimerAccuracyThread();  
    }
    }
    
    public void finishLoop(){
        running=false;
    }
    
    @Override
    public void run() {
      
       while(running){
       
           long currentLoopTime_ms=getCurrentTimeMS();
           
           
           long nextLoopTime_ms=currentLoopTime_ms+MS_BETWEEN_FRAMES;
           long remaining_ms=nextLoopTime_ms-getCurrentTimeMS();
           try {
               Thread.sleep(remaining_ms);
           } catch (InterruptedException ex){}
           
       }   
    }

    private static long getCurrentTimeMS() {
        return System.nanoTime()/1000000;
    }



    private void createTimerAccuracyThread() {
        // On windows the sleep functions can be highly inaccurate by
        // over 10ms making in unusable. However it can be forced to
        // be a bit more accurate by running a separate sleeping daemon
        // thread.
        Thread timerAccuracyThread = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(Long.MAX_VALUE);
                } catch (InterruptedException e) {
                }
            }
        });
        
        timerAccuracyThread.setDaemon(true);
        timerAccuracyThread.start();
    }
}