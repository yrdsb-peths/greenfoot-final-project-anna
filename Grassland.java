import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grassland here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grassland extends Terrains
{
    /**
     * Act - do whatever the Grassland wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public Grassland(int height, int width)
    {
        getImage().scale(height, width);
    }
}
