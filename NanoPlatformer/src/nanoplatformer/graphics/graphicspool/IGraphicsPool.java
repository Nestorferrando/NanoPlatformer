/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.graphics.graphicspool;

import nanoplatformer.graphics.GraphicItem;

/**
 *
 * @author Nestor
 */
public interface IGraphicsPool {
    
    
public void loadFromCurrentDirectory();
    
public GraphicItem getFromName(String name);
    
    
    
}
