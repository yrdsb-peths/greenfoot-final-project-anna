import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruits extends Actor
{
    public GreenfootImage[] images;
    public GreenfootImage[] gone;
    public final int WIDTH = 97;
    public final int HEIGHT = 97;
    private int curIndex = 0;
    private int delay = 0;
    private SimpleTimer animTimer;
    
    public void animateFruit()
    {
        setImage(images[curIndex]);
        
        if(animTimer.millisElapsed() > 20)
        {
            curIndex++;
            curIndex %= 17;
            animTimer.mark();
        }
    }
    /**
     *This method animates the dissapearing of the fruits when touched 
     *by any subclass of the Player class
     */
    public void collected()
    {
        if(isTouching(Players.class))
        {
            gone = new GreenfootImage[6];   
            for(int i = 0; i < gone.length; i++)
            {
                gone[i] = new GreenfootImage("images/Sprite/PixelAdventure/Items/Fruits/Collected/" + i + ".png");
                gone[i].scale(WIDTH, HEIGHT);
            }
            setImage(gone[0]);
            animTimer = new SimpleTimer();
            animTimer.mark();
        }
        animateGone();
    }
    public void animateGone()
    {
        setImage(gone[curIndex]);
        
        if(animTimer.millisElapsed() > 20)
        {
            curIndex++;
            curIndex %= 6;
            animTimer.mark();
        }   
    }
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateFruit();
        collected();
    }   
}
