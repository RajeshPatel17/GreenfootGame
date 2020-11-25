import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Gun Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class Net extends Weapons
{
    // Instance Variables
    private int size;
    private GreenfootImage img = new GreenfootImage("net.png");
    
    /**
     * Net constructor function
     */
    public Net(){
        setImage(img);
        img.scale(300,300);
        size = 10;
    }
    
    /**
     * Act - do whatever the net wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       netUsed();
       
    }
    
    /**
     * Net size down method.
     * Scale the net down to 1 square pixel, then remove the object once it is small enough
     */
    public void sizeDown(){
        
        int width = (int)(img.getWidth() *.85);
        int height = (int)(img.getHeight() *.85);
        img.scale(width, height);
        size--;
        if(size == 1) {
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Net used method
     * When the net is instantiated, find all of the objects surrounding the net and remove them
     * Once removed, adjust the player's score accordingly based on what the objects are
     * Subtract the score if it is an animal, and increase it if it is garbage.
     */
    public void netUsed(){
       if(getObjectsInRange(150, NonWeapons.class) != null){
           List<NonWeapons> nw = getObjectsInRange(150, NonWeapons.class);
           for(NonWeapons non: nw){
               if(non instanceof Animals){
                   seaworld.score--;
               } else {
                   seaworld.score++;
               }
               getWorld().removeObject(non);
           }
       }
       sizeDown();
    }
}
