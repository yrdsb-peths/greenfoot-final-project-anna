import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Enemies
{
    private GreenfootImage[] idle = new GreenfootImage[18];
    private SimpleTimer animTimer;
    
    public Tree()
    {        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Sprite/PixelAdventure/Trunk/" + i + ".png");  
            idle[i].scale(200, 100);
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
        if(animTimer.millisElapsed() > 70)
        {
            curIndex++;
            curIndex %= 17;
            animTimer.mark();    
        }
    }
}
