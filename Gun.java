import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Gun Class
 * 
 * @author Rajesh Patel, Johnathan Sewell, Garrett Dickinson
 * @version 4-18-2020
 */
public class Gun extends Weapons
{
    // Instance variables
    private static int reload;
    private int countRotate = 0;
    
    /**
     * Gun class constructor
     */
    public Gun() {
        reload = 20;
    }
    
    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage("spider-crab.png");
        followPlayer();
        aim();
        shoot();
        reloadGun();
    }
    
    /**
     * Follow player method.
     * Update the gun object's location based on the player's position
     */
    public void followPlayer() {
        Player p = getWorld().getObjects(Player.class).get(0);
        if (p != null) {
            this.setLocation(p.getX() + 10, p.getY());
        }
    }
    
    /**
     * Gun aim method.
     * Rotate the gun in the position of the mouse location.
     */
    public void aim() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){
            this.turnTowards(mouse.getX(), mouse.getY());
        }
        
    }
    
    /**
     * Gun shooting method.
     * When the mouse is clicked, instantiate a new bullet in the direction of the mouse pointer
     * Subtract 1 from the player's ammo count
     */
    public void shoot() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(reload > 0 ) {
            //int button = mouse.getButton();
            if(mouse!=null && Greenfoot.mouseClicked(null)) {
                Bullet b = new Bullet();
                getWorld().addObject(b, getX(), getY());
                b.turnTowards(mouse.getX(), mouse.getY());
                reload--;
                Greenfoot.playSound("bubble_01.mp3");
            }
        }
    }
    
    /**
     * Reload gun method.
     * When the ammo counter reaches 0, reset to 20 when the player presses the R key.
     */
    public void reloadGun() {
        if(reload < 20) {
            if(Greenfoot.isKeyDown("r")) {
                reload = 20;
                Greenfoot.playSound("click.mp3");
            }
        }
    }
    
    /**
     * Get the amount of ammo the player has left.
     * @return int - reload value
     */
    public static int getReload() {
        return reload;
    }
    
     
}
