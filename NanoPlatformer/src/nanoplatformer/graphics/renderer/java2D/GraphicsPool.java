/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanoplatformer.graphics.renderer.java2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import nanoplatformer.graphics.renderer.GraphicItem;
import nanoplatformer.graphics.renderer.PNGFileFilter;

/**
 *
 * @author Nestor
 */
public class GraphicsPool {

    private Map<GraphicItem, BufferedImage> graphicsMap;

    public GraphicsPool() {
        this.graphicsMap = new HashMap();

        loadPNGGraphicsFromCurrentDirectory();

    }

    public BufferedImage getBufferedImage(GraphicItem item) {
        return graphicsMap.get(item);
    }

    private void loadPNGGraphicsFromCurrentDirectory() {

        String[] imageFileNames = new File(".").list(new PNGFileFilter());

        for (String filename : imageFileNames) {
            try {

                graphicsMap.put(new GraphicItem(removeExtension(filename)), ImageIO.read(new File(filename)));
            } catch (IOException ex) {
            }
        }
        
    }

    private static String removeExtension(String image) {
        return image.substring(0, image.indexOf("."));
    }

}
