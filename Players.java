import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @Anna Cheng 
 * @June 19 2022
 */
public class Players extends Actor
{
    public final int GRAVITY = 1;
    public final int SHIFT = 5;
    public final int WIDTH = 70;
    public final int HEIGHT = 70;
    public int velocity;
    
    public Players()
    {
        velocity = 0;
    }
    public void act()
    {
        fall();
        if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up") && isTouching(Terrains.class))
        {
            jump();
        }        
        navigate();
    }
    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if(isTouching(Terrains.class))
        {
            velocity = 0;
        }
        else
        {
            velocity += GRAVITY;
        }
    }
    public void jump()
    {
        velocity = -20;    
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