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
    public int curIndex = 0; 
    public boolean isFacingRight = true;

    public void act()
    {
        move();
    }
    public void move()
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
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            y += SHIFT;
        }
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            y -= SHIFT;
        } 
        setLocation(x,y);
    }
}