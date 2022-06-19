import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NinjaFrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NinjaFrog extends Players
{
    private GreenfootImage[] runRightImages = new GreenfootImage[12];
    private GreenfootImage[] runLeftImages = new GreenfootImage[12];
    private GreenfootImage[] idleImages = new GreenfootImage[11];
    private GreenfootImage[] jumpImages = new GreenfootImage[6];

    private SimpleTimer animTimer;

    public NinjaFrog()
    {        
        for(int i = 0; i < idleImages.length; i++)
        {
            idleImages[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/idle/" + i + ".png");  
            idleImages[i].scale(WIDTH, HEIGHT);
        }
        for(int i = 0; i < runRightImages.length; i++)
        {
            runRightImages[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/run/"+ i + ".png");    
            runRightImages[i].scale(WIDTH, HEIGHT);

            runLeftImages[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/run/"+ i + ".png");   
            runLeftImages[i].mirrorHorizontally();
            runLeftImages[i].scale(WIDTH, HEIGHT);
        }
        for(int i = 0; i < jumpImages.length; i++)
        {
            jumpImages[i] = new GreenfootImage("images/Sprite/PixelAdventure/MainCharacters/Ninja_Frog/jump/" + i + ".png");
            jumpImages[i].scale(WIDTH, HEIGHT);
        }

        setImage(idleImages[0]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }

    public void animateJump()
    {
        if (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up"))
        {
            setImage(jumpImages[curIndex]);
        }
        if(animTimer.millisElapsed() > 50)
        {
            curIndex++;
            curIndex %= 5;
            animTimer.mark();    
        }
    }

    public void animateShift()
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

    public void act()
    {
        jump();
        fall();
        navigate();
        animateJump();
        animateShift();
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
