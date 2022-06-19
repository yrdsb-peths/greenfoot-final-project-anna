import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @Anna Cheng 
 * @June 19 2022
 */
public class Level2 extends Levels
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        GreenfootImage bkgrd = new GreenfootImage("images/colour0.png");
        bkgrd.scale(getWidth(), getHeight());
        setBackground(bkgrd);
        
        addObject(new NinjaFrog(), 34, 78);
        addObject(new Platform(), 81, 629);
    }
}
