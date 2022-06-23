import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @Anna Cheng 
 * @June 21 2022
 */
public class MyWorld extends World
{   
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1, false); 
        TitleScreenWorld title = new TitleScreenWorld();
        Greenfoot.setWorld(title);
        Greenfoot.playSound("bgm.mp3");
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
