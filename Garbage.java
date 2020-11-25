import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Garbage Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class Garbage extends NonWeapons
{
    /**
     * Act - do whatever the Garbage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    } 
    
    /**
     * Check if garbage is touching an animal, and remove the animal if true
     */
    public void ifTouchingRemove() {
       if(this.isTouching(Animals.class)) {
            this.removeTouching(Animals.class);
        } 
    }
    
    /**
     * Check if garbage is at edge of world, and return that state.
     * @return bool - if garbage is at edge
     */
    public boolean garbageIsAtEdge() {
        if(this.getY() == 400) {
          return true;  
          
        }
        return false;
    }
}
