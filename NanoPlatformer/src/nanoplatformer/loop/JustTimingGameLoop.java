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
public class JustTimingGameLoop extends GameLoop {

    private long previousTime;

    public JustTimingGameLoop(int framesPerSecond) {
        super(framesPerSecond);
    }
    
    
    
    @Override
    protected void performLoopOperations(long currentLoopTime_ms) {
        System.out.println("current time: "+currentLoopTime_ms+", elapsed time: "+(currentLoopTime_ms-previousTime));
        
        performRandomCalculations();
        previousTime=currentLoopTime_ms;
        
    }

    private void performRandomCalculations() {
        try {
            Thread.sleep( (long)(Math.random()*10));
        } catch (InterruptedException ex){}
    }

     
}
