import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heal_Spell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heal_Spell extends Actor
{
    String Heal_1;
    String Heal_2;
    String Heal_3;
    String Heal_4;
    String Heal_5;
    String Heal_6;
    String Heal_7;
    String Heal_8;
    String Heal_9;
    String Heal_10;
    String Heal_11;
    
    boolean df = false;

    int imageAnimationCounter = 0;
    int counter = 0;
    public void act() 
    {
            background level = (background)this.getWorld();
            if (!(df))
            {
                    if (counter == 1)
                    {
                        
                        setImage(Heal_1);

                    }
                    else if (counter == 2)
                    {
                        
                        setImage(Heal_2);
                        
                    }
                    else if (counter == 3)
                    {
                        
                        setImage(Heal_3);  
                        
                    }
                    else if (counter == 4)
                    {
                        
                        setImage(Heal_4);
                        
                    }
                    else if (counter == 5)
                    {
                        
                        setImage(Heal_5);
                        
                    }
                    else if (counter == 6)
                    {
                        
                        setImage(Heal_6);   
                        
                    }
                    else if (counter == 7)
                    {
                        
                        setImage(Heal_7);
                        
                    }
                    else if (counter == 8)
                    {
                        
                        setImage(Heal_8);
                        
                    }
                    else if (counter == 9)
                    {
                        
                        setImage(Heal_9);   
                        
                    }
                    else if (counter == 10)
                    {
                        
                        setImage(Heal_10);    
                        
                    }
                    else if (counter == 11)
                    {
                        
                        setImage(Heal_11);
                        
                        df = true;
                    }                
                    
                    
                    if (imageAnimationCounter == 5000)
                    {
                        counter = counter + 1;    
                    }
                imageAnimationCounter = (imageAnimationCounter + 1) % 5001;
            }
            if (df)
            {
                level.removeObject(this);
            }
            
        }
        
}