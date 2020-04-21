import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Comp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comp extends Actor
{
    public int dy = 1;
    public Comp(){
        GreenfootImage myImage = getImage();
        int height = (int)myImage.getHeight()*2;
        int width = (int)myImage.getWidth()*2;
        myImage.scale(height, width);
        turn(90);
    }
    /**
     * Act - do whatever the Comp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ((getWorld().getObjects(Ball.class).size() != 0)){
            Actor ball = getWorld().getObjects(Ball.class).get(0);
            if (ball.getY()>31 && ball.getY()<getWorld().getHeight()-31){
                setLocation(getX(), ball.getY());
            }
        }
    }
}
