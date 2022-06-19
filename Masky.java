import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masky extends Players
{
    private GreenfootImage[] runRightImages;
    private GreenfootImage[] runLeftImages;
    private GreenfootImage[] idleImages;
    
    private SimpleTimer animTimer; 
    
    public Masky()
    {
        idleImages = new GreenfootImage[11]; 
        for(int i = 0; i < idleImages.length; i++)
        {
            idleImages[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Mask_Dude/Idle/tile" + i + ".png");  
            idleImages[i].scale(WIDTH, HEIGHT);
        }
            
        runRightImages = new GreenfootImage[12]; 
        runLeftImages = new GreenfootImage[12]; 
        for(int i = 0; i < runRightImages.length; i++)
        {
            runRightImages[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Mask_Dude/Run/"+ i + ".png");    
            runRightImages[i].scale(WIDTH, HEIGHT);
            runLeftImages[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Mask_Dude/Run/"+ i + ".png");   
            runLeftImages[i].mirrorHorizontally();
            runLeftImages[i].scale(WIDTH, HEIGHT);
        }
        setImage(idleImages[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }
    public void animate()
    {
        setImage(idleImages[curIndex]);    
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
    
    public void act()
    {
        animate();
        fall();
        navigate();
        jump();
    }
    public void jump()
    {
        velocity = -20;    
    }
    public void fall()
    {
        if(isTouching(Terrains.class) || isTouching(Checkpoints.class))
        {
            velocity = 0;
        }
        else
        {
            velocity += GRAVITY;
        }
        setLocation(getX(), getY() + velocity);
    }
    public void navigate()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            x += SHIFT;   
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            x -= SHIFT;
        }
        setLocation(x,y);
    }
}
