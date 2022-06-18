import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SingleBlocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SingleBlocks extends Grassland
{
    /**
     * Act - do whatever the SingleBlocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public final int WIDTH = 80;
    public final int HEIGHT = 80;
    
    public SingleBlocks() 
    {
        getImage().scale(WIDTH,HEIGHT);
    }
    public SingleBlocks(int width, int height)
    {
        getImage().scale(width, height);
    } 
    public void act()
    {
        // Add your action code here.
    }
}
