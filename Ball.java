import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
    public int direction = 135;
    public int speed = 3;
    public Ball(){
        GreenfootImage myImage = getImage();
        int height = (int)myImage.getHeight()*2/7;
        int width = (int)myImage.getWidth()*2/7;
        myImage.scale(height, width);
    }
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("1")){
            speed = 3;
        }else if(Greenfoot.isKeyDown("2")){
            speed = 9;
        }else if(Greenfoot.isKeyDown("3")){
            speed = 15;
        }
        move(speed);
        if (getY() <= 5 || getY() >= getWorld().getHeight()-5){
            direction = 360-getRotation();
        }else if(isTouching(Player.class) || isTouching(Comp.class)){
            if (isTouching(Player.class)){
                setLocation(getX()+2, getY());
            }else{
                setLocation(getX()-2, getY());
            }
            direction = 180-getRotation();
        }else if(getX() <= 5 || getX() >= getWorld().getWidth()-5){
            if (getX() <= 5){
                ((MyWorld)getWorld()).compScore();
            }else{
                ((MyWorld)getWorld()).yourScore();
            }
            ((MyWorld)getWorld()).start();
        }
        setRotation(direction);
    }
}
