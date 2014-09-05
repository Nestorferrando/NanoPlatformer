/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.samples;

import java.awt.Color;
import nanoplatformer.graphics.output.java2D.AcceleratedFrame;
import nanoplatformer.graphics.renderer.GraphicItem;
import nanoplatformer.graphics.renderer.IRenderer;
import nanoplatformer.graphics.renderer.java2D.BasicRenderer;
import nanoplatformer.graphics.renderer.java2D.GraphicsPool;


/**
 *
 * @author Nestor
 */
public class SimpleRender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
IRenderer renderer = new BasicRenderer(new GraphicsPool(),new AcceleratedFrame(640,480));


//we need to clear the background first
renderer.fillBackground(Color.yellow);
        
renderer.drawGraphic(new GraphicItem("squareDev"), 64, 64);
renderer.showBuffer();



    }
    
}
