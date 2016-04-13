import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire_Spell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire_Spell extends Actor

{
    GreenfootImage f1  = new GreenfootImage("fire1.png");
    GreenfootImage f2  = new GreenfootImage("fire2.png");
    GreenfootImage f3  = new GreenfootImage("fire3.png");
    GreenfootImage f4  = new GreenfootImage("fire4.png");
    GreenfootImage f5  = new GreenfootImage("fire5.png");
    GreenfootImage f6  = new GreenfootImage("fire6.png");
    GreenfootImage f7  = new GreenfootImage("fire7.png");
    GreenfootImage f8  = new GreenfootImage("fire8.png");
    GreenfootImage f9  = new GreenfootImage("fire9.png");
    GreenfootImage f10 = new GreenfootImage("fire10.png");
    GreenfootImage f11 = new GreenfootImage("fire11.png");
    GreenfootImage f12 = new GreenfootImage("fire12.png");
    GreenfootImage f13 = new GreenfootImage("fire13.png");
    GreenfootImage f14 = new GreenfootImage("fire14.png");
    GreenfootImage f15 = new GreenfootImage("fire15.png");
    GreenfootImage f16 = new GreenfootImage("fire16.png");
    GreenfootImage f17 = new GreenfootImage("fire17.png");
    GreenfootImage f18 = new GreenfootImage("fire18.png");
    GreenfootImage f19 = new GreenfootImage("fire19.png");
    GreenfootImage f20 = new GreenfootImage("fire20.png");
    GreenfootImage f21 = new GreenfootImage("fire21.png");
    
    int counter = 0;
    
    int _counter = 0;
    
    public void act()
    
    {
        
        background level = (background)this.getWorld();
        
        if (counter == 1)
        
        {
            
            setImage(f1);
                        
        }
        
        else if (counter == 2)
        
        {
            
            setImage(f2);
            
        }
        
        else if (counter == 3)
        
        {
            
            setImage(f3);
            
        }
        
        else if (counter == 4)
        
        {
            
            setImage(f4);
            
        }
        
        else if (counter == 5)
        
        {
            
            setImage(f5);
            
        }
        
        else if (counter == 6)
        
        {
            
            setImage(f6);
            
        }
        
        else if (counter == 7)
        
        {  
            
            setImage(f7);
            
        }
        
        else if (counter == 8)
        
        {
            
            setImage(f8);
            
        }
        
        else if (counter == 9)
        
        {
            
            setImage(f9);
            
        }
        
        else if (counter == 10)
        
        {
            
            setImage(f10);
            
        }
        
        else if (counter == 11)
        
        {
            
            setImage(f11);
            
        }
        
        else if (counter == 12)
        
        {
            
            setImage(f12);
            
        }
        
        else if (counter == 13)
        
        {        
            
            setImage(f13);
            
        }
        
        else if (counter == 14)
        
        {
            
            setImage(f14);
            
        }
        
        else if (counter == 15)
        
        {
            
            setImage(f15);
            
        }
        
        else if (counter == 16)
        
        {
            
            setImage(f16);
            
        }
        
        else if (counter == 17)
        
        {
            
            setImage(f17);
            
        }
        
        else if (counter == 18)
        
        {
            
            setImage(f18);
            
        }
        
        else if (counter == 19)
        
        {    
            
            setImage(f19);
            
        }
        
        else if (counter == 20)
        
        {
            
            setImage(f20);
            
        }
        
        else if (counter == 21)
        
        {
            
            setImage(f21);
            
        }
        
        else if (counter == 22)
        
        {
            
            if (!(level.turn))
            
            {
                
                level.turn = true;
                
                level.removeObject(this);
                
            }
            
            else if (level.turn)
            
            {
                
                level.turn = false;
                
                level.removeObject(this);
                
            }            
            
        }
        
        if (_counter == 15000)
        
        {
            
            counter = counter + 1;
            
        }
        
        _counter = (_counter + 1) % 15001;
        
    }    
    
}
