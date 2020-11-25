import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Turtle Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class Turtle extends Animals
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() +1);
        if (this.getY() >= getWorld().getHeight()) {
            getWorld().removeObject(this);
        }
    }    
}
