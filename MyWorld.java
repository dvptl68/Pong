import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int yourScore = 0;
    private int compScore = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,308,204);
        start.setLocation(308,200);
    }
    public void start(){
        List objects = getObjects(null);
        removeObjects(objects);
        Ball ball = new Ball();
        addObject(ball,getWidth()/2,getHeight()/2);
        Player player = new Player();
        addObject(player,20,getHeight()/2);
        Comp comp = new Comp();
        addObject(comp,getWidth()-20,getHeight()/2);
        Greenfoot.delay(50);
    }
    public void yourScore(){
        yourScore++;
    }
    public void compScore(){
        compScore++;
    }
    public void quit(){
        List objects = getObjects(null);
        removeObjects(objects);
        showText("Your Score: " + yourScore, getWidth()/2, getHeight()/2-15);
        showText("Enemy Score: " + compScore, getWidth()/2, getHeight()/2+15);
        Greenfoot.delay(250);
        Greenfoot.setWorld(new MyWorld());
    }
}