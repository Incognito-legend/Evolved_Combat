import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dark_Anima_Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dark_Anima_Shield extends Actor

{
    
    String das_1;
    String das_2;
    String das_3;
    String das_4;
    String das_5;
    String das_6;
    String das_7;
    String das_8;
    String das_9;
    String das_10;
    String das_11;
    String das_12;
    String das_13;
    String das_14;
    String das_15;
    String das_16;
    String das_17;
    String das_18;
    String das_19;
    String das_20;
    String das_21;
    String das_22;
    String das_23;
    
    
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
                        
                        setImage(das_1);

                    }
                    
                    else if (counter == 2)
                    
                    {
                        
                        setImage(das_2);
                        
                    }
                    
                    else if (counter == 3)
                    
                    {
                        
                        setImage(das_3);  
                        
                    }
                    
                    else if (counter == 4)
                    
                    {
                        
                        setImage(das_4);
                        
                    }
                    
                    else if (counter == 5)
                    
                    {
                        
                        setImage(das_5);
                        
                    }
                    
                    else if (counter == 6)
                    
                    {
                        
                        setImage(das_6);   
                        
                    }
                    
                    else if (counter == 7)
                    
                    {
                        
                        setImage(das_7);
                        
                    }
                    
                    else if (counter == 8)
                    
                    {
                        
                        setImage(das_8);
                        
                    }
                    
                    else if (counter == 9)
                    
                    {
                        
                        setImage(das_9);   
                        
                    }
                    
                    else if (counter == 10)
                    
                    {
                        
                        setImage(das_10);    
                        
                    }
                    
                    else if (counter == 11)
                    
                    {
                        
                        setImage(das_11);
                                                
                    }          
                    
                    else if (counter == 12)
                    
                    {
                        
                         setImage(das_12);
                         
                    }
                    
                    else if (counter == 13)
                    
                    {
                        
                         setImage(das_13);
                         
                    }
                    
                    else if (counter == 14)
                    
                    {
                        
                         setImage(das_14);
                         
                    }
                    
                    else if (counter == 15)
                    
                    {
                        
                         setImage(das_15);
                         
                    }
                    
                    else if (counter == 16)
                    
                    {
                        
                         setImage(das_16);
                         
                    }
                    
                    else if (counter == 17)
                    
                    {
                        
                         setImage(das_17);
                         
                    }
                    
                    else if (counter == 18)
                    
                    {
                        
                         setImage(das_18);
                         
                    }
                    
                    else if (counter == 19)
                    
                    {
                        
                         setImage(das_19);
                         
                    }
                    
                    else if (counter == 20)
                    
                    {
                        
                         setImage(das_20);
                         
                    }
                    
                    else if (counter == 21)
                    {
                        
                         setImage(das_21);
                         
                    }
                    
                    else if (counter == 22)
                    
                    {
                        
                         setImage(das_22);
                         
                    }
                    
                    else if (counter == 23)
                    
                    {
                        
                         setImage(das_23);
                         
                    }
                    
                    else if (counter == 24)
                    
                    {
                            
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
                
                if (level.p_defend)
                
                {                                        
                    
                     if (!(level.p_defendCheck))
                     
                     {
                         
                         level.p_defendCheck = true;
                         
                     }
                     
                     if (level.p_defendCheck)
                     
                     {                         
                            
                        level.p_defend = false;
                        
                     }
                     
                }
                
                else if (level.e_defend)
                
                {                    
                    
                    level.e_defend = false;              
                    
                }
                
                else if ((!(level.p_defend)) && (!(level.e_defend)))
                
                {
                    
                    level.removeObject(this);
                    
                }                    
                
            }
            
    }    
    
}

