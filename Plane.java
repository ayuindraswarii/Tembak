import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int step = 0;
public void act() 
    {
        // Add your action code here.
        if(step % 10 == 0){
            addBullet();
        }
        if(step % 100 == 0){
         addEnemy();
        }
        step++;
        gerak();
        terkenamusuh();
    }    
    
public void addEnemy(){
    int acak = Greenfoot.getRandomNumber(2);
    if(acak == 0){
    Meteor a = new Meteor();
    getWorld().addObject(a,500, Greenfoot.getRandomNumber(500));
    }
    else if(acak == 1){
    Robot b = new Robot();
    getWorld().addObject(b,500, Greenfoot.getRandomNumber(500));
    }
    }
    
    public void gerak(){
    if(Greenfoot.isKeyDown("Left")){
        setLocation(getX()-5, getY());
    }
    else if(Greenfoot.isKeyDown("Right")){
        setLocation(getX()+5, getY());
    }
    else if(Greenfoot.isKeyDown("Up")){
        setLocation(getX(), getY()-5);
    }
    else if(Greenfoot.isKeyDown("Down")){
        setLocation(getX(), getY()+5);
    }
}

    public void addBullet(){
    if(Greenfoot.isKeyDown("A")){
        Bullet c = new Bullet();
        getWorld().addObject(c, getX()+130, getY());
    }
}
    
    public void terkenamusuh()
    {
        if(getOneIntersectingObject(Enemy.class) !=null)
        {
            Actor enemy = getOneIntersectingObject(Enemy.class);
            getWorld().removeObject(enemy);
            Life.jumlah--;
            
            if(Life.jumlah < 1)
            {
                Finish h = new Finish();
                Greenfoot.setWorld(h);
            }
        }
}
}