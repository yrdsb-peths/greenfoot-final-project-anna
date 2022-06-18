import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RectangleBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleBlock extends Grassland
{
    /**
     * Act - do whatever the RectangleBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RectangleBlock()
    {
        getImage();
    }
    public RectangleBlock(int width, int height)
    {
        getImage().scale(width, height); 
    }
    public void act()
    {
        // Add your action code here.
    }
}
