import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chicken extends Enemies
{
    private GreenfootImage[] idle = new GreenfootImage[13];
    private SimpleTimer animTimer;
    
    public Chicken()
    {        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Sprite/PixelAdventure/Chicken/" + i + ".png");  
            idle[i].scale(WIDTH, HEIGHT);
        }

        setImage(idle[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }

    public void act()
    {
        animate();
    }
    
    public void animate()
    {  
        setImage(idle[curIndex]);
        if(animTimer.millisElapsed() > 50)
        {
            curIndex++;
            curIndex %= 12;
            animTimer.mark();    
        }
    }
}
