/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.loop;

import nanoplatformer.graphics.renderer.IRenderer;
import nanoplatformer.input.IPollableInput;
import nanoplatformer.model.character.IMainCharacter;
import nanoplatformer.model.levelholder.ILevelHolder;

/**
 *
 * @author Nestor
 */
public class CompleteLoop extends BaseGameLoop {

    private IPollableInput input;
    private ILevelHolder level;
    private IMainCharacter character;
    private IRenderer renderer;
    

    
    
    public CompleteLoop(int framesPerSecond, IPollableInput input) {
        super(framesPerSecond);
        this.input=input;
    }
    
    
    
    @Override
    protected void performLoopOperations(long previousLoopTime_ms,long currentLoopTime_ms) {
       
        input.poll();
        boolean[] pressedKeys=new boolean[4];
        for (int i=0;i<4;i++) {
          pressedKeys[i]=input.isPressed(i);
        }
        
        character.update(pressedKeys, currentLoopTime_ms);
        
        
        
    }



     
}
