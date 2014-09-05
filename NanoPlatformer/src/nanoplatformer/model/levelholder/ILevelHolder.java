/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nanoplatformer.model.levelholder;


import java.util.List;
import nanoplatformer.model.LevelComponent;

/**
 *
 * @author Nestor
 */
public interface ILevelHolder {
    
    public void addLevelElement(LevelComponent element);
    
    public List<LevelComponent> getAllLevelElements();
    
    public List<LevelComponent> getElementsInside(int x,int y, int width, int height);
}
