import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int speed = 3;
    public Player(){
        GreenfootImage myImage = getImage();
        int height = (int)myImage.getHeight()*2;
        int width = (int)myImage.getWidth()*2;
        myImage.scale(height, width);
        turn(90);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("1")){
            speed = 3;
        }else if(Greenfoot.isKeyDown("2")){
            speed = 7;
        }else if(Greenfoot.isKeyDown("3")){
            speed = 11;
        }
        if ((Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("left")) && getY()>33){
            setLocation(getX(),getY()-speed);
        }
        if ((Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("right")) && getY()<getWorld().getHeight()-33){
            setLocation(getX(),getY()+speed);
        }
        if (Greenfoot.isKeyDown("q") || Greenfoot.isKeyDown("Q")){
            ((MyWorld)getWorld()).quit();
        }
    }    
}
