import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    GreenfootImage enemy = new GreenfootImage("Player_pallette_outline.png");
    int Height = 16;
    int Width = 16;
    int count_ = 0;
    boolean df1 = false;
    boolean df2 = false;
    
    public void act() 
    {        
        background level = (background)this.getWorld();
        int rN = level.getRandomNumberRange(1,100);
        
        if (!df1)
        
        {
            
            setImage(enemy);
            
            enemy.scale(16*4, 16*4);
            
            df1 = true;
            
        }       
        
        if (!(level.turn))
            
        {
            if (!(df2))
            
            {
            
            
                count_ = (count_ + 1) % 30001;
              if (count_ == 30000)
        
              {         
                  
                if (rN > 75)
                
                {                
                    
                    level.addObject(new Fire_Spell_Start_Phase(), 500, 200);
                    
                    level.hit = true;  
                               
                    
                    
                    df2 = true;
                    
                }
                
                else if (rN <= 75)
                
                {
                    
                    level.addObject(new Fire_Spell_Start_Phase(), 500, 200);
                    
                    level.miss = true;
                                  
                    
                    
                    df2 = true;
                    
                }
                
                        //                 else if ((rN <= 35) && (rN > 20))
                        //                 
                        //                 {
                        //                     
                        //                     level.defend = true;
                        //                     
                        //                     level.fssp = true;
                        //                     
                        //                     df2 = true;
                        //                     
                        //                 }
                        //                 
                        //                 else if ((rN <= 20) && (rN >= 1))
                        //                 
                        //                 {
                        //                     
                        //                     level.heal = true;
                        //                     
                        //                     level.fssp = true;
                        //                     
                        //                     df2 = true;
                        //                     
                        //                 }
                
              } 
              
            }       
            
        }
        
        if (level.turn)
        
        {
            
            df2 = false;
            
        }
        
    }    
    
    public void scale(int width, int height)
    {
        
    }
    
    public int getHeight()
    {
        
        return Height;
        
    }
    
    public int getWidth()
    {
        
        return Width;
        
    }
    
}


