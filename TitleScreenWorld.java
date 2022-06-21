import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreenWorld extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("sounds/backingTrack.mp3");
    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 700, 1, true); 
        //background
        GreenfootImage background = new GreenfootImage("images/colour6.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(new Title(), 559, 181);
        addObject(new Start(250,250), 553, 423);
        
        //add Characters
        addObject(new Bee(), 888, 610);
        addObject(new Pig(), 576, 610);
        addObject(new Chicken(), 242, 610);
        addObject(new Duck(), 403, 610);
        addObject(new Tree(), 729, 610);
    }
    
    public void act()
    {
        backgroundMusic.play();
        if(Greenfoot.mouseClicked(null))
        {
            Greenfoot.setWorld(new InstructionsWorld());
        } 
    }
}
