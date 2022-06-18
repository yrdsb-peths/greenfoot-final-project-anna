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
        addObject(new RectangleBlock(300, 250), 488, 638);
        addObject(new B1(90,90), 338, 617);
        addObject(new B1(), 224, 665);
        addObject(new B2(), 303, 665);
        addObject(new B3(120, 100), 625, 623);
        addObject(new SquareBlock(270, 270), 980, 667);
        addObject(new B2(), 681, 668);
        addObject(new B2(), 757, 668);
        addObject(new B2(), 835, 668);
        addObject(new Platform(200, 90), 92, 668);
        addObject(new Platform(), 377, 333);
        addObject(new Platform(90, 60), 276, 348);
        addObject(new Platform(200, 80), 62, 464);
        addObject(new Platform(210, 80), 1044, 393);
        addObject(new Platform(230, 90), 702, 229);
        addObject(new Platform(90, 60), 702, 257);
        
        //Fruits
        addObject(new Apple(), 276, 261);
        addObject(new Apple(), 353, 261);
        addObject(new Apple(), 430, 261);
        addObject(new Apple(), 308, 201);
        addObject(new Apple(), 390, 201);
        addObject(new Apple(), 353, 143);
        addObject(new Lemon(), 655, 153);
        addObject(new Lemon(), 744, 153);
        addObject(new Lemon(), 699, 89);
        addObject(new Cherry(), 59, 555);
        addObject(new Cherry(), 159, 555);
        addObject(new Cherry(), 253, 555);
        addObject(new Pineapple(), 1035, 310);
        addObject(new Pineapple(), 1035, 205);
        addObject(new Pineapple(), 1035, 96);
        //Player
        addObject(new Masky(), 82, 618);
        //addObject(new EndFlag(), 40, 70);
    }
}
