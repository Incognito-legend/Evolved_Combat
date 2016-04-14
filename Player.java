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
    
    String lastKeyPressed;
    
    int Height = 16;
    int Width = 16;
    int count_ = 0;
    boolean df1 = false;
    boolean df2 = false;
    boolean df3 = false;
    boolean restart = false;
    boolean rC = false;
    boolean numDF = true;
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
                               
                               for (number = Integer.parseInt(selection); (selection == ""); number = 0)
                                
                               
                               
                              
                               
                               //javax.lang.NumberFormatException.forInputString
                               
                               
                               if (number == 0)
                               
                               {
                                   
                                   lastKeyPressed = null;
                                   selection = javax.swing.JOptionPane.showInputDialog("1: Attack, 2: Defend, 3: Heal");
                                   
                               }
                               
                               if (number == 1)
                               
                               {
                                   
                                   lastKeyPressed = "1";
                                   
                                   System.out.println("Casting Fire Spell...");
                                   
                                   df2 = true;
                                   
                               }
                               
                               if (number == 2)
                               
                               {
                                   
                                   lastKeyPressed = "2";
                                   
                                   System.out.println("Defending...");                                                                      
                                   
                                   level.Defend_Shield_Effect.play();
                                   
                                   level.p_defend = true;
                                    
                                   level.addObject(new DAS_Images(), 100, 200);
                                   
                                   //delay(1);
                                   
                                   level.turn = false;
                                   
                               }
                               
                                   if (number == 3)
                                   
                                       
                                       {
                                           
                                           if  (level.mana > 0)
                                           {
                                               
                                                   
                                                   lastKeyPressed = "3";
                                                   
                                                   System.out.println("Casting Healing Spell...");
                                                  
                                                   level.playerHP = level.playerHP + level.playerMAG;
                                                   
                                                   if (level.playerHP > 30)
                                                   {
                                                       level.playerHP = 30;    
                                                   }
                                                  System.out.println("p_HP = " + level.playerHP);
                                                   
                                                   level.HealMagic.play();
                                                   
                                                   level.p_heal = true;
                                                   
                                                   level.addObject(new Heal_Images(), 100, 200);                                                                     
                                                   
                                                   //delay(1);
                                                   
                                                   level.mana = level.mana - 10;
                                                   System.out.println("Mana: " + level.mana);                                       
                                                   
                                                   
                                                   level.turn = false;
                                                   
                                          }
                                          
                                          else if (level.mana <= 0)
                                          
                                          {
                                              
                                              selection = javax.swing.JOptionPane.showInputDialog("1: Attack (out of mana), 2: Defend (absorb enemy spell damage for mana), 3: Heal (out of mana)");
                                              
                                          }
                                  
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
                                                                       
                    }
                   
               }    
            
               if (df2)
               
               {
                   
                       if (count_ == 10000)
                        
                       {
                            level.playerAttackAnimation = true;
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
                       count_ = (count_ + 1) % 10001; 
                  
               } 
               
             }
        
        
        else if ((!(Greenfoot.isKeyDown("1"))) && (df2))
        
        {
            
            df2 = false;
            
        }        
        
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
