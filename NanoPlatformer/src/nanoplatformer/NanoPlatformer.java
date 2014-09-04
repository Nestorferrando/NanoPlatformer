/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer;

import nanoplatformer.loop.GameLoop;
import nanoplatformer.loop.JustTimingGameLoop;

/**
 *
 * @author Nestor
 */
public class NanoPlatformer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GameLoop loop= new JustTimingGameLoop();
        loop.start();
    }
    
}
