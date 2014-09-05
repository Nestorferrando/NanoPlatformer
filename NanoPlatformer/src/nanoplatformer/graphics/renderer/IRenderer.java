/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.graphics.renderer;

import java.awt.Color;

/**
 *
 * @author Nestor
 */

public interface IRenderer {
    
    
    public void drawGraphic(GraphicItem resource,int positionX, int positionY);
    
    public void fillBackground(Color color);
    
    public void showBuffer();
    
}
