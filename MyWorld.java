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
        //TitleScreen
        GreenfootImage background = new GreenfootImage("images/colour6.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(new Title(), 559, 181);
        addObject(new Start(200,200), 551, 422);
        
        //add Characters
        addObject(new Bee(), 888, 610);
        addObject(new Pig(), 576, 610);
        addObject(new Chicken(), 242, 610);
        addObject(new Duck(), 403, 610);
        addObject(new Tree(), 729, 610);
        
        if(Greenfoot.mouseClicked(null))
        {
            Greenfoot.setWorld(new InstructionsWorld());
        }
        if(Greenfoot.mouseClicked(null))
        {
            Greenfoot.setWorld(new Level1());
        }
    }
}
