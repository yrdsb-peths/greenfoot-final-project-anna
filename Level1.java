import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        //want to set background to one of the subclasses of the Background class
        GreenfootImage bkgrd = new GreenfootImage("images/colour1.png");
        bkgrd.scale(getWidth(), getHeight());
        setBackground(bkgrd);
        
        addObject(new Masky(), 27, 573);
        
    }
}
