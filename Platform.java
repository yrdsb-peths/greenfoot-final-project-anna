import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Grassland
{
    public final int WIDTH = 180;
    public final int HEIGHT = 90;
    
    public Platform() 
    {
        getImage().scale(WIDTH, HEIGHT);
    }
    public Platform(int width, int height)
    {
        getImage().scale(width, height);
    }
    
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
