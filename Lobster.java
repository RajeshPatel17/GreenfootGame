import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lobster Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class Lobster extends Animals
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() , getY() +1);
        if (this.getY() >= getWorld().getHeight()) {
            getWorld().removeObject(this);
        }
    }    
}
