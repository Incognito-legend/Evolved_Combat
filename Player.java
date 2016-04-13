import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    GreenfootImage player = new GreenfootImage("Player_pallette_outline.png");
    String input;
     String selection;
    int Height = 16;
    int Width = 16;
    int count_ = 0;
    boolean df1 = false;
    boolean df2 = false;
    boolean df3 = false;
    boolean restart = false;
    boolean rC = false;
    int number;
    public void act() 
    
    {        
        
        background level = (background)this.getWorld();
        
        int rN = level.getRandomNumberRange(1,100);
        
        if (!df1)
        
        {
            
            setImage(player);
            player.scale(16*4, 16*4);
            df1 = true;
            
        }

        
            if (level.turn)
            
            {
                
               if ((Greenfoot.isKeyDown("1")) && (!(df2)) && (!(level.hit)) && (!(level.miss)) && (!(level.fssp)))
                
               {
                                   
                 selection = javax.swing.JOptionPane.showInputDialog("1: Attack, 2: Defend, 3: Heal");
                 
                 if (selection == "")
                           {
                               selection = null;
                           }
                   if (!(selection == null))
                       {
                           
                           if (!(selection == ""))
                           {
                               
                               number = Integer.parseInt(selection);
                              
                               if (number == 0)
                               {
                                   
                                   selection = javax.swing.JOptionPane.showInputDialog("1: Attack, 2: Defend, 3: Heal");
                                   
                               }
                               if (number == 1)
                               {
                                   
                                   //System.out.println("Casting Fire Spell...");
                                   df2 = true;
                               }
                               if (number == 2)
                               {
                                   
                                   System.out.println("Defending...");
                                   //level.playerDEF = level.playerDEF + 1;
                                   level.Defend_Shield_Effect.play();
                                   level.addObject(new Heal_Images(), 100, 200);
                                   
                                   delay(1);
                                   level.turn = false;
                               }
                               if (number == 3)
                               {
                                   
                                   //System.out.println("Casting Healing Spell...");
                                   level.playerHP = level.playerHP + level.playerMAG;
                                   System.out.println("p_HP = " + level.playerHP);
                                   //if (level.getRandomNumberRange(1,100) >= 90)
                                   //{
                                   //    
                                   //    level.enemyHP = level.enemyHP + level.enemyMAG;
                                   //    System.out.println("e_HP = " + level.enemyHP);
                                   //}

                                   level.HealMagic.play();
                                   level.addObject(new Heal_Images(), 100, 200);
                                   
                                   delay(1);
                                   level.turn = false;
                               }
                           } 
                           else if (selection == "")
                           {
                               selection = javax.swing.JOptionPane.showInputDialog("1: Attack, 2: Defend, 3: Heal");
                            }
                           
                       
                       
                    }
                    else if (selection == null)
                    {
                        selection = javax.swing.JOptionPane.showInputDialog("1: Attack, 2: Defend, 3: Heal");
                        number = Integer.parseInt(selection);
                    }
                   
               }    
            
               if (df2)
               
               {
                       if (count_ == 10000)
                        
                       {
                            if (rN > 45)
                            
                            {                
                                
                                level.addObject(new Fire_Spell_Start_Phase(), 100, 200);
                                
                                level.hit = true;                                       
                                
                                df2 = false;             
                                
                            }
                            
                            else if (rN <= 45)
                            
                            {
                                
                                level.addObject(new Fire_Spell_Start_Phase(), 100, 200);
                                
                                level.miss = true;
                                                                        
                                df2 = false;
                                
                            }
                            
                       } 
                  
               } 
               
             }
        
        
        else if ((!(Greenfoot.isKeyDown("1"))) && (df2))
        
        {
            
            df2 = false;
            
        }        
        count_ = (count_ + 1) % 10001; 
      } 
      
     public static void delay(int time)
     {
         
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
