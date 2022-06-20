import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndFlag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndFlag extends Checkpoints
{
    /**
     * Act - do whatever the EndFlag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private SimpleTimer animTimer;
    private GreenfootImage[] endPoint;
    
    public EndFlag()
    {
        endPoint = new GreenfootImage[8];
        for(int i = 0; i < endPoint.length; i++)
        {
            endPoint[i] = new GreenfootImage("images/Sprite/PixelAdventure/Items/Checkpoints/End/"+ i + ".png");
            endPoint[i].scale(70, 70);
        }
        setImage(endPoint[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }
    int curIndex = 0;
    public void animate()
    {
        setImage(endPoint[curIndex]);
        if(animTimer.millisElapsed()> 5)
        {
            curIndex++;
            curIndex %= 7;
            animTimer.mark();
        }
    }
    public void act()
    {
        animate();
    }
}
