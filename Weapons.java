import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Weapons Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */

public class Weapons extends Actor
{
    /**
     * Act - do whatever the Weapons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        netGoOff();
    }
    
    /**
     * Net attack function.
     * Instantiate a new net object when the user presses the Q key.
     */
    public void netGoOff() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
            if(seaworld.nets > 0){
                if(Greenfoot.isKeyDown("Q")){
                    getWorld().addObject(new Net(), mouse.getX(), mouse.getY());
                }
            }
    
    }
    
}
