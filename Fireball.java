import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fireball extends Actor
{
    GreenfootImage fireball = new GreenfootImage("fire2.png");
    int x = 100;
    int y = 200;
    int count__ = 0;
    public void act() 
    {
        
        background level = (background)this.getWorld();
                  if (count__ == 900)
                     {
                       setLocation(x = x + 1, y = getY());
                     }
        count__ = (count__ + 1) % 901;
        
        if (!(level.hit_check))
        
        {
            
           
        
        
        if (x >= 500)
        {
            level.hit_check = true;
            level.removeObject(this);
                                                
        }
        
    }
       
        
    }    
    
    
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
