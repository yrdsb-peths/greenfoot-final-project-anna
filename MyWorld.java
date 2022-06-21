import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @Anna Cheng 
 * @June 21 2022
 */
public class MyWorld extends World
{   
    private static GreenfootSound bgm;
    private int actCounter = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1, false); 
        bgm = new GreenfootSound("sounds/backingTrack.mp3");
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
    public void act()
    {
        startMusic();
        actCounter++;
        if(actCounter > 3)
        {
            stopMusic();
        }
    }
    public static void startMusic()
    {
        bgm.playLoop();
    }
    public static void stopMusic()
    {
        bgm.stop();
    }
}
