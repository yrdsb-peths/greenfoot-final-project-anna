import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    public Label scoreLabel = new Label(0, 80);
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1, false); 
        
        TitleScreenWorld title = new TitleScreenWorld();
        Greenfoot.setWorld(title);
        
        if(Greenfoot.mouseClicked(Buttons.class))
        {
            Greenfoot.setWorld(new InstructionsWorld());
        }
        if(Greenfoot.mouseClicked(Buttons.class))
        {
            Greenfoot.setWorld(new Level1());
        }
    }
}
