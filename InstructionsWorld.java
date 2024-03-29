import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsWorld here.
 * 
 * @Anna Cheng 
 * @June 22 2022
 */
public class InstructionsWorld extends World
{
    public InstructionsWorld()
    {    
        super(1100, 700, 1, true); 
        //Background
        GreenfootImage background = new GreenfootImage("images/colour6.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        //Instructions
        Label move = new Label("How to Move", 80);
        addObject(move, 544, 69);
        Label jump = new Label("How to Jump", 80);
        addObject(jump, 544, 310);
        
        //Goal
        Label goal = new Label("Goal", 80);
        addObject(goal, 544, 515);
        
        Label instruct1 = new Label("Collect all the fruits and touch the", 50);
        addObject(instruct1, 544, 592);
        
        Label instruct2 = new Label("trophy to get to the next level.", 50);
        addObject(instruct2, 544, 650);
        
        //Keyboard Images
        addObject(new Letters(200, 150), 661, 191);
        addObject(new ArrowKeys(200, 150), 423, 191);       
        addObject(new Spacebar(250, 150), 419, 419);
        addObject(new Up(100, 100), 674, 419);
        addObject(new Start(90, 90), 1039, 637);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            Greenfoot.setWorld(new Level1());
        }
    }
}
