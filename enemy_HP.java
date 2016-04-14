import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_String HP_Gauge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_HP extends Actor
{
        String HP_0; 
        String HP_1; 
        String HP_2;
        String HP_3; 
        String HP_4; 
        String HP_5; 
        String HP_6; 
        String HP_7; 
        String HP_8; 
        String HP_9; 
        String HP_10; 
        String HP_11; 
        String HP_12; 
        String HP_13; 
        String HP_14; 
        String HP_15; 
        String HP_16; 
        String HP_17; 
        String HP_18; 
        String HP_19; 
        String HP_20; 
        String HP_21;
        String HP_22; 
        String HP_23; 
        String HP_24; 
        String HP_25; 
    boolean df = false;

    int imageAnimationCounter = 0;
    int counter = 0;
    int counter_II = 0;
    
    public void act() 
    {
        
            background level = (background)this.getWorld();
            if (!(df))
            {
                    if (counter == 0)
                    {
                        setImage(HP_0);
                    }
                    else if (counter == 1)
                    {
                        setImage(HP_1);
                    }
                    else if (counter == 2)
                    {
                        setImage(HP_2);
                    }
                    else if (counter == 3)
                    {
                        setImage(HP_3);    
                    }
                    else if (counter == 4)
                    {
                        setImage(HP_4);
                    }
                    else if (counter == 5)
                    {
                        setImage(HP_5);
                    }
                    else if (counter == 6)
                    {
                        setImage(HP_6);    
                    }
                    else if (counter == 7)
                    {
                        setImage(HP_7);
                    }
                    else if (counter == 8)
                    {
                        setImage(HP_8);
                    }
                    else if (counter == 9)
                    {
                        setImage(HP_9);    
                    }
                    else if (counter == 10)
                    {
                        setImage(HP_10);    
                    }
                    else if (counter == 11)
                    {
                        setImage(HP_11);
                    }
                    else if (counter == 12)
                    {
                        setImage(HP_12);
                    }
                    else if (counter == 13)
                    {
                        setImage(HP_13);    
                    }
                    else if (counter == 14)
                    {
                        setImage(HP_14);
                    }
                    else if (counter == 15)
                    {
                        setImage(HP_15);
                    }
                    else if (counter == 16)
                    {
                        setImage(HP_16);    
                    }
                    else if (counter == 17)
                    {
                        setImage(HP_17);
                    }
                    else if (counter == 18)
                    {
                        setImage(HP_18);
                    }
                    else if (counter == 19)
                    {
                        setImage(HP_19);    
                    }
                    else if (counter == 20)
                    {
                        setImage(HP_20);    
                    }
                    else if (counter == 21)
                    {
                        setImage(HP_21);
                    }
                    else if (counter == 22)
                    {
                        setImage(HP_22);
                    }
                    else if (counter == 23)
                    {
                        setImage(HP_23);    
                    }
                    else if (counter == 24)
                    {
                        setImage(HP_24);
                    }
                    else if (counter == 25)
                    {
                        setImage(HP_25);
                        
                        df = true;
                    }                
                    
                    if (imageAnimationCounter == 10000)
                    {
                    counter = counter + 1;    
                    }
                imageAnimationCounter = (imageAnimationCounter + 1) % 10001;
            }
            
            if (df)
            
            {
                if (level.dfCheck)
                
                    {
                      
                        if (level.enemyHP < 30)
                                {
                                    
                                 if (counter_II == 20000)
                            {   
                                    
                                
                                
                            
                                
                                dmg(level.enemyHP = level.enemyHP + 1);
                                
                                
                                
                                counter_II = 0;
                                
                            
                            
                            }
                    
                        counter_II = (counter_II + 1) % 20001;
                    }
                    else if ((level.enemyHP >= 30) && (level.playerHP >= 30))
                    {
                        dmg(25);
                        level.dfCheck = false;
                    }
                    
                }
               if ((level.enemyHP <= 0) || (level.enemyHP == 0))
                
                    {
                        
                        dmg(0);
                        
                    }
                    else if (level.enemyHP == 1)
                    {
                        dmg(1);
                    }
                    else if (level.enemyHP == 2)
                    {
                        dmg(2);
                    }
                    else if (level.enemyHP == 3)
                    {
                        dmg(3);    
                    }
                    else if (level.enemyHP == 4)
                    {
                        dmg(4);
                    }
                    else if (level.enemyHP == 5)
                    {
                        dmg(5);
                    }
                    else if (level.enemyHP == 6)
                    {
                        dmg(6);    
                    }
                    else if (level.enemyHP == 7)
                    {
                        dmg(7);
                    }
                    else if (level.enemyHP == 8)
                    {
                        dmg(8);
                    }
                    else if (level.enemyHP == 9)
                    {
                        dmg(9);    
                    }
                    else if (level.enemyHP == 10)
                    {
                        dmg(10);    
                    }
                    else if (level.enemyHP == 11)
                    {
                        dmg(11);
                    }
                    else if (level.enemyHP == 12)
                    {
                        dmg(12);
                    }
                    else if (level.enemyHP == 13)
                    {
                        dmg(13);    
                    }
                    else if (level.enemyHP == 14)
                    {
                        dmg(14);
                    }
                    else if (level.enemyHP == 15)
                    {
                        dmg(15);
                    }
                    else if (level.enemyHP == 16)
                    {
                        dmg(16);    
                    }
                    else if (level.enemyHP == 17)
                    {
                        dmg(17);
                    }
                    else if (level.enemyHP == 18)
                    {
                        dmg(18);
                    }
                    else if (level.enemyHP == 19)
                    {
                        dmg(19);    
                    }
                    else if (level.enemyHP == 20)
                    {
                        dmg(20);    
                    }
                    else if (level.enemyHP == 21)
                    {
                        dmg(21);
                    }
                    else if (level.enemyHP == 22)
                    {
                        dmg(22);
                    }
                    else if (level.enemyHP == 23)
                    {
                        dmg(23);    
                    }
                    else if (level.enemyHP == 24)
                    {
                        dmg(24);
                    }
                    else if ((level.enemyHP == 25) || (level.enemyHP >= 30))
                    {
                        dmg(25);
                    }     
                
            }
   }    
   public int dmg(int counter_)
   {
       background level = (background)this.getWorld();
       if (counter_ == 0)
                    {
                        setImage(HP_0);
                        if (!(level.dfCheck))
                        {
                            level.dfCheck = true;
                        }
                    }
                    else if (counter_ == 1)
                    {
                        setImage(HP_1);
                    }
                    else if (counter_ == 2)
                    {
                        setImage(HP_2);
                    }
                    else if (counter_ ==3)
                    {
                        setImage(HP_3);    
                    }
                    else if (counter_ ==4)
                    {
                        setImage(HP_4);
                    }
                    else if (counter_ ==5)
                    {
                        setImage(HP_5);
                    }
                    else if (counter_ ==6)
                    {
                        setImage(HP_6);    
                    }
                    else if (counter_ ==7)
                    {
                        setImage(HP_7);
                    }
                    else if (counter_ ==8)
                    {
                        setImage(HP_8);
                    }
                    else if (counter_ ==9)
                    {
                        setImage(HP_9);    
                    }
                    else if (counter_ ==10)
                    {
                        setImage(HP_10);    
                    }
                    else if (counter_ ==11)
                    {
                        setImage(HP_11);
                    }
                    else if (counter_ ==12)
                    {
                        setImage(HP_12);
                    }
                    else if (counter_ ==13)
                    {
                        setImage(HP_13);    
                    }
                    else if (counter_ ==14)
                    {
                        setImage(HP_14);
                    }
                    else if (counter_ ==15)
                    {
                        setImage(HP_15);
                    }
                    else if (counter_ ==16)
                    {
                        setImage(HP_16);    
                    }
                    else if (counter_ ==17)
                    {
                        setImage(HP_17);
                    }
                    else if (counter_ ==18)
                    {
                        setImage(HP_18);
                    }
                    else if (counter_ ==19)
                    {
                        setImage(HP_19);    
                    }
                    else if (counter_ ==20)
                    {
                        setImage(HP_20);    
                    }
                    else if (counter_ ==21)
                    {
                        setImage(HP_21);
                    }
                    else if (counter_ ==22)
                    {
                        setImage(HP_22);
                    }
                    else if (counter_ ==23)
                    {
                        setImage(HP_23);    
                    }
                    else if (counter_ ==24)
                    {
                        setImage(HP_24);
                    }
                    else if (counter_ ==25)
                    {
                        setImage(HP_25);
                    }     
                    return counter_;
   }
   
    public void scale(int width, int height)
    {
        
    }
}
