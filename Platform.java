import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Grassland
{
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Platform() 
    {
        getImage();
    }
    public Platform(int width, int height)
    {
        getImage().scale(width, height);
    }
    public void act()
    {
        // Add your action code here.
    }
}