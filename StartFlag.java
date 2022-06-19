import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartFlag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartFlag extends Checkpoints
{
    public GreenfootImage[] flagImages;
    public final int WIDTH = 97;
    public final int HEIGHT = 97;
    private int curIndex = 0;
    private int delay = 0;
    private SimpleTimer animTimer;
    
    
    public void animate()
    {
        setImage(flagImages[curIndex]);
        if(animTimer.millisElapsed() > 20)
        {
            curIndex++;
            curIndex %= 17;
            animTimer.mark();
        }
    }
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animate();
    } 
}
