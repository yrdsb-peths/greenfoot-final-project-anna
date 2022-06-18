import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terrains here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terrains extends Actor
{
    /**
     * Act - do whatever the Terrains wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int width;
    int height;
    public Terrains() 
    {
        getImage();
    }
    public Terrains(int width, int height)
    {
        getImage().scale(width, height);
    }
    public void act()
    {
        // Add your action code here.
    }
}
