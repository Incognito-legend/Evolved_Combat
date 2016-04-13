import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire_Spell_Start_Phase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire_Spell_Start_Phase extends Actor
{
    GreenfootImage flare_1 = new GreenfootImage("flare1.png");
    GreenfootImage flare_2 = new GreenfootImage("flare2.png");
    GreenfootImage flare_3 = new GreenfootImage("flare3.png");
    GreenfootImage flare_4 = new GreenfootImage("flare4.png");
    GreenfootImage flare_5 = new GreenfootImage("flare5.png");
    GreenfootImage flare_6 = new GreenfootImage("flare6.png");
    GreenfootImage flare_7 = new GreenfootImage("flare7.png");
    GreenfootImage flare_8 = new GreenfootImage("flare8.png");
    GreenfootImage flare_9 = new GreenfootImage("flare9.png");
    GreenfootImage flare_10 = new GreenfootImage("flare10.png");
    GreenfootImage flare_11 = new GreenfootImage("flare11.png");
    GreenfootImage flare_12 = new GreenfootImage("flare12.png");
    GreenfootImage flare_13 = new GreenfootImage("flare13.png");
    GreenfootImage flare_14 = new GreenfootImage("flare14.png");
    GreenfootImage flare_15 = new GreenfootImage("flare15.png");
    GreenfootImage flare_16 = new GreenfootImage("flare16.png");
    
    int counter = 0;
    
    int _counter = 0;
    
    public void act() 
    {
                        
        background level = (background)this.getWorld();
        
        if (counter == 1)
        {
            
            setImage(flare_1);
                        
        }
        else if (counter == 2)
        {
            
            setImage(flare_2);
            
        }
        else if (counter == 3)
        {
            
            setImage(flare_3);
            
        }
        else if (counter == 4)
        {
            
            setImage(flare_4);
            
        }
        else if (counter == 5)
        {
            
            setImage(flare_5);
            
        }
        else if (counter == 6)
        {
            
            setImage(flare_6);
            
        }
        else if (counter == 7)
        {  
            
            setImage(flare_7);
            
        }
        else if (counter == 8)
        {
            
            setImage(flare_8);
            
        }
        else if (counter == 9)
        {
            
            setImage(flare_9);
            
        }
        else if (counter == 10)
        {
            
            setImage(flare_10);
            
        }
        else if (counter == 11)
        {
            
            setImage(flare_11);
            
        }
        else if (counter == 12)
        
        {
            
            setImage(flare_12);
            
        }
        else if (counter == 13)
        {        
            
            setImage(flare_13);
            
        }
        else if (counter == 14)
        {
            
            setImage(flare_14);
            
        }
        else if (counter == 15)
        {
            
            setImage(flare_15);
            
        }
        else if (counter == 16)
        {
            
            setImage(flare_16);
            
        }

        else if (counter == 17)
        
        {
             
            level.fssp = true;
            
            level.removeObject(this);                       
            
        }
        
        if (_counter == 15000)
        
        {
            
            counter = counter + 1;
            
        }
        
        _counter = (_counter + 1) % 15001;
        
  } 
}

