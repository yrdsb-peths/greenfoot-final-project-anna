import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NinjaFrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NinjaFrog extends Players
{
    private GreenfootImage[] runRight;
    private GreenfootImage[] runLeft;
    private GreenfootImage[] idle;
    private GreenfootImage[] jump;

    private SimpleTimer animTimer;
    private int delay = 0;
    private boolean isFacingRight = true;
    int curIndex = 0;

    public NinjaFrog()
    {
        idle = new GreenfootImage[11]; 
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/idle/" + i + ".png");  
            idle[i].scale(WIDTH, HEIGHT);
        }

        runRight = new GreenfootImage[12]; 
        runLeft = new GreenfootImage[12]; 
        for(int i = 0; i < runRight.length; i++)
        {
            runRight[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/run/"+ i + ".png");    
            runRight[i].scale(WIDTH, HEIGHT);
            runLeft[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/run/"+ i + ".png");   
            runLeft[i].mirrorHorizontally();
            runLeft[i].scale(WIDTH, HEIGHT);
        }
        jump = new GreenfootImage[6];
        for(int i = 0; i < jump.length; i++)
        {
            jump[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/jump/" + i + ".png");
            jump[i].scale(WIDTH, HEIGHT);
        }
        setImage(idle[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }

    public void animateMove()
    {  
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            setImage(runRight[curIndex]);
        }
        else if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            setImage(runLeft[curIndex]);
        }
        if(animTimer.millisElapsed() > 50)
        {
            curIndex++;
            curIndex %= 11;
            animTimer.mark();    
        }
    }

    public void animateJump()
    {
        curIndex = 0;
        if (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up"))
        {
            setImage(jump[curIndex]);
        }
        if(animTimer.millisElapsed() > 50)
        {
            curIndex++;
            curIndex %= 5;
            animTimer.mark();    
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            isFacingRight = false;
            move(-3);
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            isFacingRight = true;
            move(3);
        }
        animateMove();
        animateJump();
    }
}
