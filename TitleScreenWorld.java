import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreenWorld extends World
{

    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 700, 1, true); 
        //Greenfoot.playSound("frog_sound.mp3");

        Label title = new Label("Fruit Buddies", 100);
        addObject(title, 562, 270);
        
        //background
        
        
        //add start button 
        
        
    }
    
    public void act()
    {
        // if mouse clicked if(Greenfoot.)  
    }
}
