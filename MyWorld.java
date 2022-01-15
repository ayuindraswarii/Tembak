import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 550, 1); 
        
        Plane ayu = new Plane();
        addObject(ayu, 80, 450);
        
        Score x = new Score();
        addObject(x, 50, 50);
        
        Life y = new Life();
        addObject(y, 400, 50);
        
        Score.nilai = 0;
        Life.jumlah = 3;
    }
}
