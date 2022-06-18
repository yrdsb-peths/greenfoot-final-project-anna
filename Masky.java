import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masky extends Players
{
    private GreenfootImage[] runRight;
    private GreenfootImage[] runLeft;
    private GreenfootImage[] idle;

    private SimpleTimer animTimer;
    private int delay = 0;
    private boolean isFacingRight = true;
    int curIndex = 0;
    
    public Masky()
    {
        idle = new GreenfootImage[11]; 
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Mask_Dude/Idle/tile" + i + ".png");  
            idle[i].scale(70, 70);
        }
            
        //runRight = new GreenfootImage[]; 
        //runLeft = new GreenfootImage[]; 
        //for(int i = 0; i < )
        setImage(idle[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.jump();
        super.fall();
        super.checkFalling();
        super.navigate();
    }
    
}
