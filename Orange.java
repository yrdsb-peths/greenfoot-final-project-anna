import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orange extends Fruits
{
    private SimpleTimer animTimer;
    public Orange()
    {
        images = new GreenfootImage[17];
        
        for(int i = 0; i < images.length; i++)
        {
            images[i] = new GreenfootImage("images/Sprite/PixelAdventure/Items/Fruits/Orange/" + i + ".png");
            images[i].scale(WIDTH, HEIGHT);
        }
        setImage(images[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        super.animateFruit();
        super.collected();
    }
}
