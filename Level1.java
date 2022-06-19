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
        GreenfootImage bkgrd = new GreenfootImage("images/colour5.png");
        bkgrd.scale(getWidth(), getHeight());
        setBackground(bkgrd);

        //Terrain
        addObject(new B1(90,90), 338, 617);
        addObject(new B1(), 224, 665);
        addObject(new B2(), 303, 665);       
        addObject(new B2(), 681, 668);
        addObject(new B2(), 757, 668);
        addObject(new B2(), 835, 668);
        addObject(new B3(120, 100), 625, 623);
        addObject(new SquareBlock(270, 270), 980, 667);
        addObject(new RectangleBlock(300, 250), 488, 638);
        addObject(new Platform(200, 70), 92, 679);
        addObject(new Platform(200, 70), 377, 313);
        addObject(new Platform(100, 40), 276, 320);
        addObject(new Platform(230, 60), 62, 484);
        addObject(new Platform(220, 60), 1044, 393);
        addObject(new Platform(240, 70), 702, 189);
        addObject(new Platform(100, 40), 702, 217);
        
        //Fruits
        addObject(new Apple(), 276, 241);
        addObject(new Apple(), 353, 241);
        addObject(new Apple(), 430, 241);
        addObject(new Apple(), 308, 181);
        addObject(new Apple(), 390, 181);
        addObject(new Apple(), 353, 123);
        addObject(new Lemon(), 655, 123);
        addObject(new Lemon(), 744, 123);
        addObject(new Lemon(), 699, 59);
        addObject(new Cherry(), 378, 463);
        addObject(new Cherry(), 486, 463);
        addObject(new Cherry(), 585, 463);
        addObject(new Pineapple(), 1035, 310);
        addObject(new Pineapple(), 1035, 205);
        addObject(new Pineapple(), 1035, 96);
        
        //Checkpoints
        addObject(new StartFlag(), 57, 602);
        //addObject(new EndFlag(), 40, 70);
        
        //Player
        addObject(new NinjaFrog(), 73, 605);
    }
}
