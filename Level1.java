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
        addObject(new B1(90,90), 310, 611);
        addObject(new B1(), 232, 667);
        addObject(new B2(), 312, 667);       
        addObject(new B2(), 681, 682);
        addObject(new B2(), 757, 682);
        addObject(new B2(), 835, 682);
        addObject(new B3(120, 100), 652, 651);
        addObject(new SquareBlock(270, 270), 980, 667);
        addObject(new RectangleBlock(300, 250), 488, 650);
        addObject(new Platform(200, 70), 95, 693);
        addObject(new Platform(200, 70), 377, 293);
        addObject(new Platform(100, 40), 277, 319);
        addObject(new Platform(230, 60), 64, 470);
        addObject(new Platform(220, 60), 1044, 393);
        addObject(new Platform(240, 70), 722, 189);
        addObject(new Platform(100, 40), 722, 217);
        
        //Fruits
        addObject(new Apple(), 276, 221);
        addObject(new Apple(), 353, 221);
        addObject(new Apple(), 430, 221);
        addObject(new Apple(), 308, 161);
        addObject(new Apple(), 390, 161);
        addObject(new Apple(), 353, 103);
        addObject(new Lemon(), 675, 103);
        addObject(new Lemon(), 764, 103);
        addObject(new Lemon(), 719, 39);
        addObject(new Cherry(), 378, 483);
        addObject(new Cherry(), 486, 483);
        addObject(new Cherry(), 585, 483);
        addObject(new Pineapple(), 1035, 310);
        addObject(new Pineapple(), 1035, 205);
        addObject(new Pineapple(), 1035, 96);
        
        //Checkpoints
        addObject(new StartFlag(), 56, 613);
        //addObject(new EndFlag(), 40, 70);
        
        //Player
        addObject(new NinjaFrog(), 73, 616);
    }
}
