/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.model.character;

import nanoplatformer.graphics.ImageInfo;

/**
 *
 * @author Nestor
 */
public interface IMainCharacter {
    
    public void update(boolean[] keys,long timestamp);
    
    public float getPositionX();

    public float getPositionY();

    public ImageInfo getImageInfo();
    
    
    
}
