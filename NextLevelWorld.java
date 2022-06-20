import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevelWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevelWorld extends World
{

    /**
     * Constructor for objects of class NextLevelWorld.
     * 
     */
    public NextLevelWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 700, 1, true); 
        Greenfoot.playSound("endPage.mp3");
        //Background
        GreenfootImage background = new GreenfootImage("images/colour6.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        //Congratulate
        Label good = new Label("Well Done!", 140);
        addObject(good, 562, 244);
        
        Label level2 = new Label("Level 2 Coming Soon...", 100);
        addObject(level2, 570, 477);
    }
}
