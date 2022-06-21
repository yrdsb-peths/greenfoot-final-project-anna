import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreenWorld here.
 * 
 * @Anna Cheng
 * @June 20 2022
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
    public void started(){
        
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            Greenfoot.setWorld(new InstructionsWorld());
        } 
    }
}
