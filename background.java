import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World

{
    
    
    GreenfootSound GameMusic = new GreenfootSound("Legend of Magvel - Main Game Music 2.wav");
    GreenfootSound Defend_Shield_Effect = new GreenfootSound("shine_fixed.wav");
    GreenfootSound HealMagic = new GreenfootSound("eclipse_fixed.wav");
    boolean turn = true;
    boolean hit = false;
    boolean miss = false;
    boolean heal = false;
    boolean defend = false;
    boolean fssp = false;
    int count_ = 0;
    int count = 0;
    boolean hit_check = false;
    boolean hit_check_df = false;
    
    int enemyHP = 60;
    int enemyATK = 10;
    int enemyMAG = 10;
    int enemyDEF = 5;
    int enemyDMG_ABSORPTION = 0;
    int enemyDMG = 0;
    
    
    int playerHP = 60;
    int playerATK = 10;
    int playerMAG = 10;
    int playerDEF = 5;
    int playerDMG_ABSORPTION = 0;
    int playerDMG = 0;
    
    int wins = 0;
    int defeats = 0;
    
    int count_II = 0;
    boolean musicPlayCheck = false;
    boolean adminCheatsCheck = false;
    public background()
    
    {    
        
        super(600, 400, 1);
        
        addObject(new Player(), 100, 200);
        addObject(new HP_Images(), 100, 300);
        
        addObject(new Enemy(), 500, 200);
        addObject(new enemy_HP_Images(), 500, 300);
                
        
        //addObject(new GuessingGameGUI(), 0, 0);
        
    }
    
    public void setLocation(int _x, int _y)
    
    {
        
    }
    public void started()
    {
         GameMusic.playLoop();
    }
    public void stopped()
    {
         GameMusic.stop();
    }
    
    public void act()
    
    {
        if ((!(adminCheatsCheck)) && (Greenfoot.isKeyDown("f")) && (Greenfoot.isKeyDown("3")) && (Greenfoot.isKeyDown("p")))
        {
            
            enemyHP = 5;
            System.out.println("Admin.Cheats.Activated");
            adminCheatsCheck = true;
        }
        
                //         if (!(musicPlayCheck))
                //         
                //         {
                //             
                //             GameMusic.playLoop();
                //             
                //             musicPlayCheck = true;
                //             
                //         }
                //         
                //         else if (musicPlayCheck)
                //         
                //         {
                //             
                //             changeSongTrack();
                //             
                //         }
        
        if ((turn) && (hit))
        
        {
            
                if (fssp)
                
                {    
                    if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Fireball(), 100, 200);
                                //System.out.println("fireball add check");
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                            if (count_ == 10000)
                            
                              {
                                
                                  
                                addObject(new Fire_Spell(), 500, 200);
                                
                                enemyDMG_ABSORPTION = enemyDEF + enemyMAG;
                                
                                playerDMG = playerATK + playerMAG;
                                System.out.println("PlayerDMG = " + playerDMG);
                                System.out.println("enemyDMG_ABSORBTION = " + enemyDMG_ABSORPTION);
                                
                                if (enemyDMG_ABSORPTION > playerDMG)
                                {
                                    enemyDMG_ABSORPTION = playerDMG;
                                }
                                
                                 System.out.println("Balance.check: enemyDMG_ABSORBTION = " + enemyDMG_ABSORPTION);
                                 
                                enemyHP = enemyHP + (enemyDMG_ABSORPTION - playerDMG);
                                 System.out.println("enemyHP = " + enemyHP);
                                 System.out.println("---------------------------------------------------------------");
                                if (enemyHP <= 0)
                                {
                                    //if (count_II == 10000)
                                    //{
                                        wins = wins + 1;
                                        enemyHP = 0;
                                        playerHP = 60;
                                        enemyHP = 60;
                                    //}
                                    //count_II = (count_II + 1) % 10001;
                                }
                                                                                                
                                hit = false;
                                
                                fssp = false;
                                hit_check_df = false;
                                hit_check = false;
                                
                              }
                        
                              count_ = (count_ + 1) % 10001;
                        }
                    }
                }
                else if (!(fssp))
                {
                    count = 0;
                    count_ = 0;
                }
                
        }        
        
       
        if ((!(turn)) && (hit))
            
        {
                                
                if (fssp)
                
                {
                    if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Enemy_Fireball(), 500, 200);
                                
                                playerDMG_ABSORPTION = playerDEF + playerMAG;
                                
                                enemyDMG = enemyATK + enemyMAG;
                                System.out.println("enemyDMG = " + enemyDMG);
                                
                                System.out.println("DMG_ABSORBTION = " + playerDMG_ABSORPTION);
                                
                                if (playerDMG_ABSORPTION > enemyDMG)
                                {
                                    playerDMG_ABSORPTION = enemyDMG;
                                }
                                System.out.println("Balance.check: playerDMG_ABSORBTION = " + playerDMG_ABSORPTION);
                                playerHP = playerHP + (playerDMG_ABSORPTION - enemyDMG);
                                 System.out.println("playerHP = " + playerHP);
                                 System.out.println("---------------------------------------------------------------");
                                if (playerHP <= 0)
                                {
                                    // if (count_II == 10000)
                                    //{
                                        defeats = defeats + 1;
                                        playerHP = 0;
                                        enemyHP = 60;
                                        playerHP = 60;
                                    //}
                                    //count_II = (count_II + 1) % 10001;
                                }
                                    //                                 System.out.println("fireball add check");
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                            if (count_ == 10000)
                            
                              {
                                
                                addObject(new Fire_Spell(), 100, 200);
                                                            
                                hit = false;
                                
                                fssp = false;
                                hit_check_df = false;
                                hit_check = false;
                                
                              }
                        
                              count_ = (count_ + 1) % 10001;
                        }
                    }
                    
                }
                else if (!(fssp))
                {
                    count_ = 0;
                }                        
        }
        
        if ((turn) && (miss))
        
        {
            
            if (fssp)
            
            {
                if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Fireball(), 100, 200);
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                            
                                
                                        if (count_ == 20000)
                            
                            {
                             addObject(new Miss_Images(), 500, 100);   
                             turn = false;
                             fssp = false;
                             miss = false;
                             hit_check_df = false;
                                hit_check = false;
                            }                            
                            
                              count_ = (count_ + 1) % 20001;                                                                                               
                        }
                        
                }
            
                     
                    
            }    
            
            else if (!(fssp))
            
            {
                    count_ = 0;
            }    

        }
        
        else if ((!(turn)) && (miss))
                    
            {
            
            if (fssp)
            
            {   
                   
                    if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Enemy_Fireball(), 500, 200);
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                                     count_ = (count_ + 1) % 20001;
                            if (count_ == 20000)
                            
                            {
                             addObject(new Miss_Images(), 100, 100);      
                             turn = true;
                             fssp = false;
                             miss = false;
                             hit_check_df = false;
                             hit_check = false;
                            }   
                                
                                                                                                                        
                        }
                        
                }
            }    
            
            else if (!(fssp))
            
            {
                    count_ = 0;
            }    
                     
        }   
        
        if ((!(turn)) && (heal))
        
        {
                    if (fssp)
                        
                        {
                            if (!(hit_check))
                            {
                                if (!(hit_check_df))
                                {
                                    
                                     if (count == 20000)
                                    
                                    {
                                        HealMagic.play();
                                        turn = true;
                                        fssp = false;
                                        heal = false;
                                        hit_check_df = true;
                                        hit_check = true;
                                    }
                                    count_ = (count_ + 1) % 20001;
                                    
                                    
                                }
                                
                            }
                           
                        }
        }
        
        if ((!(turn)) && (defend))
                                    {
                                        Defend_Shield_Effect.play();
                                        level.addObject(new Heal_Images(), 100, 200);
                                        turn = true;
                                        defend = false;
                                    }
    }
    
                public void changeSongTrack()
            {
                        
                        if (!(GameMusic.isPlaying()))
                        {
                            
                            GameMusic.play();
                            
                        }
                        
                    }
                    
            
                                                                   
    public static int getRandomNumberRange(int start, int end)
    
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
}
