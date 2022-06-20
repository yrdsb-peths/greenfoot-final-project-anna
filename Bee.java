import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Enemies
{
    private GreenfootImage[] idle = new GreenfootImage[6];
    private SimpleTimer animTimer;
    
    public Bee()
    {        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Sprite/PixelAdventure/Bee/" + i + ".png");  
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
            curIndex %= 5;
            animTimer.mark();    
        }
    }
}
