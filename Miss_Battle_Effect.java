import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Miss_Battle_Effect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Miss_Battle_Effect extends Actor
{
        GreenfootImage miss = new GreenfootImage("miss1.png");
        String miss1;
        String miss2;
        String miss3;
        String miss4;
        String miss5; 
        String miss6;
        String miss7;
        String miss8;
        String miss9;
        String miss10;
        String miss11;
        String miss12;
        String miss13;
        String miss14;
        String miss15;
        String miss16;
        String miss17;
        int Count_ = 0;
        int paICount_ = 0;
        boolean check = true;
        int t = 255;
        boolean t_check = true;
        public void act() 
        
        {
            background level = (background)this.getWorld();
            
            if (check)
            
            {
                
            if (Count_ == 1)
            
                {
                                    
                    setImage(miss1);
                    
                    if (t_check)
                    
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
            
            }
            
            else if (Count_ == 2)
            
                {
                                        
                    setImage(miss2);
                    
                    if (!(t_check))
                    
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
            
            }   
            
            else if (Count_ == 3)
            
                {
                                    
                    setImage(miss3);
                    
                    if (t_check)
                    
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }   
            
            else if (Count_ == 4)
            
                {
                    
                setImage(miss4);
                
                    if (!(t_check))
                    
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
                
            }   
            
            else if (Count_ == 5)
            
                {
                                    
                    setImage(miss5);
                    
                    if (t_check)
                    
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }   
            
            else if (Count_ == 6)
            
                {
                    
                setImage(miss6); 
                
                   if (!(t_check))
                   
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
                
            }  
            
            else if (Count_ == 7)
            
                {
                    
                setImage(miss7);  
                
                   if (t_check)
                   
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }  
            
            else if (Count_ == 8)
            
                {
                    
                setImage(miss8);     
                
                   if (!(t_check))
                   
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
                
            }  
            
            else if (Count_ == 9)
            
                {
                    
                setImage(miss9);      
                
                   if (t_check)
                   
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }  
            
            else if (Count_ == 10)
            
                {
                    
                setImage(miss10);        
                
                   if (!(t_check))
                   
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
                
            }  
            
            else if (Count_ == 11)
            
                {
                    
                setImage(miss11);    
                
                    if (t_check)
                    
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }  
            
            else if (Count_ == 12)
            
                {
                    
                setImage(miss12); 
                
                 if (!(t_check))
                 
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
                
            }  
            
            else if (Count_ == 13)
            
                {
                    
                setImage(miss13);   
                
                    if (t_check)
                    
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }  
            
            else if (Count_ == 14)
            
                {
                    
                setImage(miss14);   
                
                 if (!(t_check))
                 
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
                
            }  
            
            else if (Count_ == 15)
            
                {
                    
                setImage(miss15);     
                
                   if (t_check)
                   
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }  
            
            else if (Count_ == 16)
            
                {
                    
                setImage(miss16);     
                
                 if (!(t_check))
                 
                    {
                        
                    t = t - 15;            
                    getImage().setTransparency(t);
                    t_check = true;
                    
                }
                
            }  
            
            else if (Count_ == 17)
            
                {
                    
                setImage(miss17);    
                
                  if (t_check)
                  
                    {
                        
                    t = t - 15;
                    getImage().setTransparency(t);
                    t_check = false;
                    
                }
                
            }  
            else if (Count_ == 18)
            
            {
                //                          this.getImage().setTransparency(0);
                t = 0;
                this.getImage().setTransparency(0);
                check = false;
            }
            
            
            if (paICount_ == 10000)
            
            {
                
                Count_ = Count_ + 1;
                
            }
            
            paICount_ = (paICount_ + 1) % 10001;
            
            
            
        }
        
        
        if (!(check))
        
        {
            paICount_ = 0;
            Count_ = 0;
            
            level.removeObject(this);
            
        }
        
    }

    public int setTransparency(int t)
    
    {
        
        return t;
        
    }

}