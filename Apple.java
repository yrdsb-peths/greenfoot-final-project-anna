import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Fruits
{  
    private SimpleTimer animTimer;
    private int curIndex = 0;
      
    public Apple()
    {
        images = new GreenfootImage[17];
        
        for(int i = 0; i < images.length; i++)
        {
            images[i] = new GreenfootImage("images/Sprite/PixelAdventure/Items/Fruits/Apple/" + i + ".png");
            images[i].scale(WIDTH, HEIGHT);
        }
        setImage(images[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }
    public void animate()
    {
        setImage(images[curIndex]);
        if(animTimer.millisElapsed() > 20)
        {
            curIndex++;
            curIndex %= 17;
            animTimer.mark();
        }
    }
    public void act()
    {
        animate();
        //collected();
    }
}
