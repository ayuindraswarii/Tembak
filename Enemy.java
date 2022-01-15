import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
 /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        getDown();
        hilang();
    }  
    
    public void getDown(){
        setLocation(getX()-1, getY());
    }
    
    public void hilang(){
    if(getX() < 10){
    getWorld().removeObject(this);
    }
    
    else if(getOneIntersectingObject(Bullet.class) !=null)
    {
    Score.nilai++;
    
    Explosion abc = new Explosion();
    getWorld().addObject(abc, getX(), getY());
    Greenfoot.playSound("e.wav");
    
    Actor Bullet = getOneIntersectingObject(Bullet.class);
    getWorld().removeObject(Bullet);
    getWorld().removeObject(this);
    }
}
        
}
