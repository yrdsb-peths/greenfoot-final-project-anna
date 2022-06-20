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
       
        //background
        GreenfootImage background = new GreenfootImage("images/colour6.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        //title
        addObject(new Title(), 559, 181);
        //add start button 
        addObject(new Start(), 569, 453);
        
    }
    
    public void act()
    {
        // if mouse clicked if(Greenfoot.)  
    }
}
