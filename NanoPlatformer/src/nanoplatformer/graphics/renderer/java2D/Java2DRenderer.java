/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.graphics.renderer.java2D;

import nanoplatformer.graphics.graphicspool.java2D.Java2DGraphicsPool;
import java.awt.Color;
import java.awt.Graphics2D;
import nanoplatformer.graphics.GraphicItem;
import nanoplatformer.graphics.renderer.IRenderer;
import nanoplatformer.graphics.output.java2D.AcceleratedFrame;

/**
 *
 * @author Nestor
 */
public class Java2DRenderer implements IRenderer {
    
    private Java2DGraphicsPool graphicsPool;
    private AcceleratedFrame acceleratedFrame;

    public Java2DRenderer(Java2DGraphicsPool graphicsPool, AcceleratedFrame acceleratedFrame) {
        this.graphicsPool = graphicsPool;
        this.acceleratedFrame = acceleratedFrame;
    }

    @Override
    public void drawGraphic(GraphicItem resource, int positionX, int positionY) {
        
        Graphics2D g=acceleratedFrame.getCanvas().getGraphics();
        g.drawImage(graphicsPool.getBufferedImage(resource), positionX,positionY,null);
        g.dispose();
    }

    @Override
    public void showBuffer() {
        acceleratedFrame.getCanvas().showGraphics();
    }

    @Override
    public void fillBackground(Color color) {
       Graphics2D g=acceleratedFrame.getCanvas().getGraphics();
       g.setColor(color);
       g.fillRect(0, 0, acceleratedFrame.getWidth(), acceleratedFrame.getHeight());
       g.dispose();
    }
    
    
    
}
