import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @Anna Cheng
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
        addObject(new RectangleBlock(300, 250), 483, 563);
        addObject(new B1(90,90), 338, 547);
        addObject(new B1(), 224, 595);
        addObject(new B2(), 303, 595);
        addObject(new B3(120, 100), 625, 553);
        addObject(new SquareBlock(270, 270), 980, 597);
        addObject(new B2(), 681, 598);
        addObject(new B2(), 757, 598);
        addObject(new B2(), 835, 598);

        //addObject(new EndFlag(), 40, 70);
    }
}
