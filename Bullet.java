import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class Bullet extends Weapons
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setImage("bubble-tiny-fill.png");
        move(10);
        checkForHit();
        //checkForHitAnimals();
    }    
    
    /**
     * Check for Hit method.
     * Check to see if the bullet has collided with another object, and modify the player's points based on what the object is.
     * Subtract a point if it is an animal, and add a point if it is a piece of garbage.
     */
    public void checkForHit() {
        if (getOneIntersectingObject(Garbage.class) != null) {
            getWorld().removeObject(getOneIntersectingObject(Garbage.class));
            getWorld().removeObject(this);
            Greenfoot.playSound("splash_05.mp3");
            seaworld.score++;
        } else if (getOneIntersectingObject(Animals.class) != null) {
            getWorld().removeObject(getOneIntersectingObject(Animals.class));
            getWorld().removeObject(this);
            Greenfoot.playSound("splash_10.mp3");
            seaworld.score--;
        }
    }
}
