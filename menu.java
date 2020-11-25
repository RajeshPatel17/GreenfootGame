import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Global World Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class menu extends World
{
   // Instance Variables
   private Actor message = new SimpleActor();
    
    /**
     * Constructor for objects of class menu.
     */
   public menu()
   {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(600, 400, 1);
      // Create the title card and instantiate it on the world's creation
      setMessage("Hello and welcome to Deep Sea Cleanup!" + 
                  "\n\nThe name of the game is simple. Shoot the trash but not the fish." + 
                  "\nEach piece of trash is +1 point while fish are -1 point." +
                  "\nIf a piece of trash reaches the bottom of the screen, you lose." + 
                  "\n\nUse your mouse cursor to aim and click to shoot." +
                  "\nPress Q to use the net when you're in a pinch." +
                  "\nWhen you run out of bullets, press R to reload." +
                  "\nUse A and D to scuttle across the floor." +
                  "\n\nWhen you are ready, press the space bar to begin!" +
                  "\nGood Luck!");
      addObject(message, 300, 200);
   }
    
   /**
    * Act method for world.
    * Checks to see if the player has pressed space, and if so start the game.
    */
   public void act()
   {
      // If the user presses space, start the game
      if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new seaworld());
   }
   
   /**
    * Set the message for the title screen
    * @param text - text to display as string
    */
   public void setMessage(String text)
   {
      // Create a null image with text above it in order to create a title card.
      GreenfootImage image = null;
      if (text != null && !"".equals(text)) image = new GreenfootImage(text, 24, null, null);
      message.setImage(image);
   }  
    
}
