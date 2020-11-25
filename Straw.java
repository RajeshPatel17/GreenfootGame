import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Straw Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class Straw extends Garbage
{
    /**
     * Act - do whatever the straw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("foam_cup.png");
        setLocation(getX() , getY() +1);
        ifTouchingRemove();
        if(garbageIsAtEdge()) {
            Greenfoot.stop();
        }
    }    
}
