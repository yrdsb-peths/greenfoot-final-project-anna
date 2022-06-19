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
    //public GreenfootImage[] gone;
    public final int WIDTH = 97;
    public final int HEIGHT = 97;
    private int delay = 0;
    private SimpleTimer animTimer;
    
    /**
     *This method animates the dissapearing of the fruits when touched 
     *by any subclass of the Player class
     
    //see where to put this method!!!!!!!
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
    }
    */
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    } 
}
