import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Enemies
{
    private GreenfootImage[] idle = new GreenfootImage[11];
    private SimpleTimer animTimer;
    public void act()
    {
        animate();
    }

    public Bee()
    {        
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Sprite/PixelAdventure/Enemies/Bee/" + i + ".png");  
            idle[i].scale(WIDTH, HEIGHT);
        }

        setImage(idle[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }

    public void animate()
    {  
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            setImage(runRightImages[curIndex]);
        }
        else if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            setImage(runLeftImages[curIndex]);
        }
        if(animTimer.millisElapsed() > 50)
        {
            curIndex++;
            curIndex %= 11;
            animTimer.mark();    
        }
    }
}
