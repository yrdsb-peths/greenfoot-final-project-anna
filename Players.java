import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @Anna Cheng 
 * @June 7 2022
 */
public class Players extends Actor
{
    int vSpeed = 1;
    int accel = 0;
    int speed = 5;
    int WIDTH = 70;
    int HEIGHT = 70;
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkFalling();
        fall();
        navigate();
        jump();
    }
    public void navigate()
    {
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
    }
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
    }
    public void checkFalling()
    {
        if(!isTouching(Terrains.class))
        {
            vSpeed++; 
        }
        else
        {
            vSpeed = 0;
        }
    }
    public void jump()
    {
        if(Greenfoot.isKeyDown("space")|| Greenfoot.isKeyDown("up")) 
        {
            vSpeed = -12;
        }
    }
}
