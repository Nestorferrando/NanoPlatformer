/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.graphics.renderer.java2D;

import java.awt.image.BufferedImage;
import java.util.Map;
import nanoplatformer.graphics.renderer.GraphicItem;

/**
 *
 * @author Nestor
 */
public class GraphicsPool {
   
    private Map<GraphicItem,BufferedImage> graphicsMap;

    public GraphicsPool(Map<GraphicItem, BufferedImage> graphicsMap) {
        this.graphicsMap = graphicsMap;
        
        loadPNGGraphicsFromCurrentDirectory();
         
    }
    
    public BufferedImage getBufferedImage(GraphicItem item){
        return graphicsMap.get(item);
    }

    private void loadPNGGraphicsFromCurrentDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
