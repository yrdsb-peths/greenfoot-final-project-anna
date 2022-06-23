import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    public Label scoreLabel = new Label(0,80);
    public int score = 0;
    
    public Level1()
    {
        super(1100, 800, 1, true); 
        //Background 
        GreenfootImage bkgrd = new GreenfootImage("images/colour5.png");
        bkgrd.scale(getWidth(), getHeight());
        setBackground(bkgrd);

        //Terrain
        addObject(new B1(90,90), 310, 711);
        addObject(new B1(), 232, 767);
        addObject(new B2(), 312, 767);       
        addObject(new B2(), 681, 782);
        addObject(new B2(), 757, 782);
        addObject(new B2(), 835, 782);
        addObject(new B3(120, 100), 652, 751);
        addObject(new SquareBlock(270, 270), 980, 767);
        addObject(new RectangleBlock(300, 250), 488, 750);
        addObject(new Platform(200, 70), 95, 800);
        addObject(new Platform(200, 70), 377, 293);
        addObject(new Platform(100, 40), 277, 310);
        addObject(new Platform(230, 60), 84, 490);
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
        addObject(new StartFlag(), 52, 723);
        addObject(new EndFlag(), 1022, 609);
        
        //Player
        addObject(new NinjaFrog(), 71, 728);
        
        //Score
        addObject(scoreLabel, 50, 50);
        Label outOf = new Label("/15", 80);
        addObject(outOf, 126, 51);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void nextLevel()
    {
        if(score == 15)
        {
            Greenfoot.playSound("pass.mp3");
            Greenfoot.setWorld(new NextLevelWorld());    
        }
    }
}
