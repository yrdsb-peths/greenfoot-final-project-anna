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
        //Background 
        GreenfootImage bkgrd = new GreenfootImage("images/colour1.png");
        bkgrd.scale(getWidth(), getHeight());
        setBackground(bkgrd);
        
        //Terrain
        addObject(new Masky(), 27, 673);
        addObject(new RectangleBlock(300, 250), 483, 663);
        addObject(new B1(90,90), 338, 647);
        addObject(new B1(), 224, 695);
        addObject(new B2(), 303, 695);
        addObject(new B3(120, 100), 625, 653);
        addObject(new SquareBlock(270, 270), 980, 697);
        addObject(new B2(), 681, 698);
        addObject(new B2(), 757, 698);
        addObject(new B2(), 835, 698);
        addObject(new Platform(), 357, 363);
        addObject(new Platform(90, 60), 256, 378);
        addObject(new Platform(200, 90), 92, 698);
        //Player
        addObject(new Masky(), 15, 658);
        //addObject(new EndFlag(), 40, 70);
    }
}
