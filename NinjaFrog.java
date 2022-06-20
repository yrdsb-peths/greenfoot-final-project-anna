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
    public void act()
    {
        fall();
        navigate();
        animateJump();
        animateShift();
        eat();
    }

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
        if ((Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up")) && isOnSolidGround())
        {
            setImage(jumpImages[curIndex]);
            velocity = -15; 
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

    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if(isOnSolidGround())
        {
            velocity = 0;
            while(isOnSolidGround())
            {
                setLocation(getX(), getY() - 1);
            }
            setLocation(getX(), getY() + 1);
        }
        else if(isTouching(Checkpoints.class))
        {
            velocity = 0;
        }
        else if(velocity < 0 && didBumpHead())
        {
            velocity = 0;
        }
        else
        {
            velocity += GRAVITY;
        }
    }

    public void navigate()
    {
        int x = getX();
        int y = getY();
        if((Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) && canMoveRight())
        {
            x += SHIFT;   
        }
        if((Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) && canMoveLeft())
        {
            x -= SHIFT;
        }
        setLocation(x,y);
    }

    public void eat()
    {
        if(isTouching(Fruits.class))
        {
            removeTouching(Fruits.class);
        }
    }
    
    public boolean isOnSolidGround()
    {
        boolean isOnGround = false;
        if((getY() > getWorld().getHeight() - 50) || (isTouching(Terrains.class)))
        {
            isOnGround = true;   
        }

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();

        if((getOneObjectAtOffset(imageWidth/-2, imageHeight/2, Terrains.class) != null) ||
        (getOneObjectAtOffset(imageWidth/2, imageHeight/2, Terrains.class) != null))
        {
            isOnGround = true;
        }
        return isOnGround;
    }

    public boolean didBumpHead()
    {
        boolean bumpedHead = false;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();

        if((getOneObjectAtOffset(imageWidth/-2, imageHeight/-2, Terrains.class) != null) ||
        (getOneObjectAtOffset(imageWidth/2, imageHeight/-2, Terrains.class) != null))
        {
            bumpedHead = true;
        }  
        return bumpedHead;
    }

    public boolean canMoveLeft()
    {
        boolean canMoveL = true;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();

        if((getOneObjectAtOffset(imageWidth/-2 - SHIFT, imageHeight/-2, Terrains.class) != null) ||
        (getOneObjectAtOffset(imageWidth/-2 - SHIFT, imageHeight/2 - 1, Terrains.class) != null))
        {
            canMoveL = false;
        }  
        return canMoveL;        
    }

    public boolean canMoveRight()
    {
        boolean canMoveR = true;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();

        if((getOneObjectAtOffset(imageWidth/-2 + SHIFT, imageHeight/-2, Terrains.class) != null) ||
        (getOneObjectAtOffset(imageWidth/-2 + SHIFT, imageHeight/2 - 1, Terrains.class) != null))
        {
            canMoveR = false;
        }  
        return canMoveR;    
    }
}
