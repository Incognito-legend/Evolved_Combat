import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player_Animation_Part extends Actor
{
    String ps_000;
    String ps_001;
    String ps_002;
    String ps_003;
    String ps_004;
    String ps_005;
    String ps_006;
    String ps_007;
    String ps_008;
    String ps_009;
    String ps_010;
    String ps_011;
    String ps_012;
    String ps_013;
    String ps_014;
    String ps_015;
    String ps_016;
    String ps_017;
    String ps_018;
    String ps_019;
    String ps_020;
    String ps_021;
    String ps_022;
    String ps_023;
    String ps_024;
    String ps_025;
    String ps_026;
    String ps_027;
    String ps_028;
    String ps_029;
    String ps_030;
    String ps_031;
    String ps_032;
    String ps_033;
    String ps_034;
    String ps_035;
    String ps_036;
    String ps_037;
    String ps_038;
    String ps_039;
    String ps_040;
    String ps_041;
    String ps_042;
    String ps_043;
    String ps_044;
    String ps_045;
    String ps_046;
    String ps_047;
    String ps_048;
    String ps_049;
    String ps_050;
    String ps_051;
    String ps_052;
    String ps_053;
    String ps_054;
    String ps_055;
    String ps_056;
    String ps_057;
    String ps_058;
    String ps_059;
    String ps_060;
    String ps_061;
    String ps_062;
    String ps_063;
    String ps_064;
    String ps_065;
    String ps_066;
    String ps_067;
    String ps_068;
    String ps_069;
    String ps_070;
    String ps_071;
    String ps_072;
    String ps_073;
    String ps_074;
    String ps_075;
    String ps_076;
    String ps_077;
    String ps_078;
    String ps_079;
    String ps_080;
    String ps_081;
    String ps_082;
    String ps_083;
    String ps_084;
    String ps_085;
    String ps_086;
    String ps_087;
    String ps_088;
    String ps_089;
    String ps_090;
    String ps_091;
    String ps_092;
    String ps_093;
    String ps_094;
    String ps_095;
    String ps_096;
    String ps_097;
    String ps_098;
    String ps_099;
    String ps_100;
    String ps_101;
    String ps_102;
    String ps_103;
    String ps_104;
    String ps_105;
    String ps_106;
    String ps_107;
    String ps_108;
    String ps_109;
    String ps_110;
    String ps_111;
    String ps_112;
    String ps_113;
    String ps_114;
    String ps_115;
    String ps_116;
    String ps_117;
    String ps_118;
    String ps_119;
    String ps_120;
    String ps_121;
    String ps_122;
    String ps_123;
    String ps_124;
    String ps_125;
    String ps_126;
    String ps_127;
    String ps_128;
    String ps_129;
    String ps_130;
    String ps_131;
    String ps_132;
    String ps_133;
    String ps_134;
    String ps_135;
    String ps_136;
    String ps_137;
    String ps_138;
    String ps_139;
    String ps_140;
    String ps_141;
    String ps_142;
    String ps_143;
    String ps_144;
    String ps_145;    

    int Image_Count = 0;
    int Count_of_Count = 0;
    
    public void act() 
    {
        background level = (background)this.getWorld();
        if (level.playerAttackAnimation)
        {
            if (Count_of_Count == 5000)
            {
                Image_Count = (Image_Count + 1) % 148;
            }
            
            Count_of_Count = (Count_of_Count + 1) % 5001;
            
                if (Image_Count == 1)
                {
                    
                    setImage(ps_000); 
                    
                }       
                else if (Image_Count == 2)        
                {
        
                    setImage(ps_001);
                    
                }      
                else if (Image_Count == 3)    
                {
              
                    setImage(ps_002); 
                    
                }      
                else if (Image_Count == 4)    
                {
               
                    setImage(ps_003);
                    
                }       
                else if (Image_Count == 5)  
                {
               
                    setImage(ps_004);
                    
                }        
                else if (Image_Count == 6)  
                {
               
                    setImage(ps_005); 
                    
                }        
                else if (Image_Count == 7)    
                {
                                
                    setImage(ps_006);
                    
                }     
                else if (Image_Count == 8)  
                {
                    
                    setImage(ps_007);
                    
                }        
                else if (Image_Count == 9) 
                {
                    
                    setImage(ps_008); 
                    
                }        
                else if (Image_Count == 10)   
                {
                    setImage(ps_009);
                }      
                else if (Image_Count == 11)      
                {
                    setImage(ps_010); 
                }      
                else if (Image_Count == 12)       
                {
                    setImage(ps_011);
                }     
                else if (Image_Count == 13)    
                {
                    setImage(ps_012);
                }         
                else if (Image_Count == 14)         
                {
                    setImage(ps_013); 
                }    
                    else if (Image_Count == 15)  
                {
                    setImage(ps_014); 
                }         
                else if (Image_Count == 16)     
                {
                    setImage(ps_015); 
                }    
                else if (Image_Count == 17)      
                {
                    setImage(ps_016); 
                }     
                else if (Image_Count == 18) 
                {
                    setImage(ps_017); 
                }      
                else if (Image_Count == 19)  
                {
                    setImage(ps_018); 
                }      
                else if (Image_Count == 20)   
                {
                    setImage(ps_019);
                }     
                else if (Image_Count == 21)    
                {
                    setImage(ps_020); 
                }        
                else if (Image_Count == 22)  
                {
                    setImage(ps_021); 
                }      
                else if (Image_Count == 23)      
                {
                    setImage(ps_022);
                }         
                else if (Image_Count == 24) 
                {
                    setImage(ps_023);
                }        
                else if (Image_Count == 25)    
                {
                    setImage(ps_024); 
                }
                else if (Image_Count == 26)   
                {
                    setImage(ps_025); 
                }    
                else if (Image_Count == 27)  
                {
                    setImage(ps_026);
                }     
                else if (Image_Count == 28)   
                {
                    setImage(ps_027); 
                }   
                else if (Image_Count == 29)  
                {
                    setImage(ps_028); 
                }    
                else if (Image_Count == 30)       
                {
                    setImage(ps_029);
                }      
                else if (Image_Count == 31)     
                {
                    setImage(ps_030);
                }       
                else if (Image_Count == 32)   
                {
                    setImage(ps_031);
                }   
                else if (Image_Count == 33)   
                {
                    setImage(ps_032); 
                } 
                else if (Image_Count == 34)     
                {
                    setImage(ps_033); 
                }     
                else if (Image_Count == 35)   
                {
                    setImage(ps_034); 
                }      
                else if (Image_Count == 36)     
                {
                    setImage(ps_035);
                }     
                else if (Image_Count == 37)      
                {
                    setImage(ps_036); 
                }    
                else if (Image_Count == 38)       
                {
                    setImage(ps_037);
                }     
                else if (Image_Count == 39)    
                {
                    setImage(ps_038);
                }      
                else if (Image_Count == 40) 
                {
                    setImage(ps_039);
                }  
                else if (Image_Count == 41)   
                {
                    setImage(ps_040);
                }      
                else if (Image_Count == 42)    
                {
                    setImage(ps_041); 
                }         else if (Image_Count == 43)         {
                    setImage(ps_042); 
                }         else if (Image_Count == 44)         {
                    setImage(ps_043); 
                }         else if (Image_Count == 45)         {
                    setImage(ps_044); 
                }         else if (Image_Count == 46)         {
                    setImage(ps_045); 
                }         else if (Image_Count == 47)         {
                    setImage(ps_046); 
                }         else if (Image_Count == 48)         {
                    setImage(ps_047); 
                }         else if (Image_Count == 49)         {
                    setImage(ps_048); 
                }         else if (Image_Count == 50)         {
                    setImage(ps_049); 
                }         else if (Image_Count == 51)         {
                    setImage(ps_050); 
                }         else if (Image_Count == 52)         {
                    setImage(ps_051); 
                }         else if (Image_Count == 53)         {
                    setImage(ps_052); 
                }         else if (Image_Count == 54)         {
                    setImage(ps_053); 
                }         else if (Image_Count == 55)         {
                    setImage(ps_054); 
                }         else if (Image_Count == 56)         {
                    setImage(ps_055); 
                }         else if (Image_Count == 57)         {
                    setImage(ps_056); 
                }         else if (Image_Count == 58)         {
                    setImage(ps_057);
                }         else if (Image_Count == 59)         {
                    setImage(ps_058);
                }         else if (Image_Count == 60)         {
                    setImage(ps_059); 
                }         else if (Image_Count == 61)         {
                    setImage(ps_060);
                }         else if (Image_Count == 62)         {
                    setImage(ps_061); 
                }         else if (Image_Count == 63)         {
                    setImage(ps_062);
                }         else if (Image_Count == 64)         {
                    setImage(ps_063);
                }         else if (Image_Count == 65)         {
                    setImage(ps_064);
                }         else if (Image_Count == 66)         {
                    setImage(ps_065);
                }         else if (Image_Count == 67)         {
                    setImage(ps_066);
                }         else if (Image_Count == 68)         {
                    setImage(ps_067); 
                }         else if (Image_Count == 69)         {
                    setImage(ps_068);
                }         else if (Image_Count == 70)         {
                    setImage(ps_069); 
                }         else if (Image_Count == 71)         {
                    setImage(ps_070); 
                }         else if (Image_Count == 72)         {
                    setImage(ps_071);
                }         else if (Image_Count == 73)         {
                    setImage(ps_072);
                }         else if (Image_Count == 74)         {
                    setImage(ps_073); 
                }         else if (Image_Count == 75)         {
                    setImage(ps_074); 
                }         else if (Image_Count == 76)         {
                    setImage(ps_075); 
                }         else if (Image_Count == 77)         {
                    setImage(ps_076); 
                }         else if (Image_Count == 78)         {
                    setImage(ps_077); 
                }         else if (Image_Count == 79)         {
                    setImage(ps_078);
                }         else if (Image_Count == 80)         {
                    setImage(ps_079);
                }         else if (Image_Count == 81)         {
                    setImage(ps_080);
                }         else if (Image_Count == 82)         {
                    setImage(ps_081);
                }         else if (Image_Count == 83)         {
                    setImage(ps_082); 
                }         else if (Image_Count == 84)         {
                    setImage(ps_083);
                }         else if (Image_Count == 85)         {
                    setImage(ps_084); 
                }         else if (Image_Count == 86)         {
                    setImage(ps_085); 
                }         else if (Image_Count == 87)         {
                    setImage(ps_086); 
                }         else if (Image_Count == 88)         {
                    setImage(ps_087); 
                }         else if (Image_Count == 89)         {
                    setImage(ps_088); 
                }         else if (Image_Count == 90)         {
                    setImage(ps_089); 
                }         else if (Image_Count == 91)         {
                    setImage(ps_090); 
                }         else if (Image_Count == 92)         {
                    setImage(ps_091); 
                }         else if (Image_Count == 93)         {
                    setImage(ps_092); 
                }         else if (Image_Count == 94)         {
                    setImage(ps_093); 
                }         else if (Image_Count == 95)         {
                    setImage(ps_094); 
                }         else if (Image_Count == 96)         {
                    setImage(ps_095); 
                }         else if (Image_Count == 97)         {
                    setImage(ps_096); 
                }         else if (Image_Count == 98)         {
                    setImage(ps_097); 
                }         else if (Image_Count == 99)         {
                    setImage(ps_098); 
                }         else if (Image_Count == 100)         {
                    setImage(ps_099); 
                }         else if (Image_Count == 101)         {
                    setImage(ps_100);
                }         else if (Image_Count == 102)         {
                    setImage(ps_101);
                }         else if (Image_Count == 103)         {
                    setImage(ps_102);
                }         else if (Image_Count == 104)         {
                    setImage(ps_103);
                }         else if (Image_Count == 105)         {
                    setImage(ps_104); 
                }         else if (Image_Count == 106)         {
                    setImage(ps_105);
                }         else if (Image_Count == 107)         {
                    setImage(ps_106); 
                }         else if (Image_Count == 108)         {
                    setImage(ps_107); 
                }         else if (Image_Count == 109)         {
                    setImage(ps_108);
                }         else if (Image_Count == 110)         {
                    setImage(ps_109); 
                }         else if (Image_Count == 111)         {
                    setImage(ps_110); 
                }         else if (Image_Count == 112)         {
                    setImage(ps_111); 
                }         else if (Image_Count == 113)         {
                    setImage(ps_112);
                }         else if (Image_Count == 114)         {
                    setImage(ps_113);
                }         else if (Image_Count == 115)         {
                    setImage(ps_114); 
                }         else if (Image_Count == 116)         {
                    setImage(ps_115); 
                }         else if (Image_Count == 117)         {
                    setImage(ps_116);
                }         else if (Image_Count == 118)         {
                    setImage(ps_117); 
                }         else if (Image_Count == 119)         {
                    setImage(ps_118);
                }         else if (Image_Count == 120)         {
                    setImage(ps_119);
                }         else if (Image_Count == 121)         {
                    setImage(ps_120); 
                }         else if (Image_Count == 122)         {
                    setImage(ps_121); 
                }         else if (Image_Count == 123)         {
                    setImage(ps_122); 
                }         else if (Image_Count == 124)         {
                    setImage(ps_123); 
                }         else if (Image_Count == 125)         {
                    setImage(ps_124); 
                }         else if (Image_Count == 126)         {
                    setImage(ps_125); 
                }         else if (Image_Count == 127)         {
                    setImage(ps_126); 
                }         else if (Image_Count == 128)         {
                    setImage(ps_127);
                }         else if (Image_Count == 129)         {
                    setImage(ps_128); 
                }         else if (Image_Count == 130)         {
                    setImage(ps_129); 
                }         else if (Image_Count == 131)         {
                    setImage(ps_130);
                }         else if (Image_Count == 132)         {
                    setImage(ps_131);
                }         else if (Image_Count == 133)         {
                    setImage(ps_132); 
                }         else if (Image_Count == 134)         {
                    setImage(ps_133);
                }         else if (Image_Count == 135)         {
                    setImage(ps_134); 
                }         else if (Image_Count == 136)         {
                    setImage(ps_135);
                }         else if (Image_Count == 137)         {
                    setImage(ps_136); 
                }         else if (Image_Count == 138)         {
                    setImage(ps_137);
                }         else if (Image_Count == 139)         {
                    setImage(ps_138); 
                }         else if (Image_Count == 140)         {
                    setImage(ps_139); 
                }         else if (Image_Count == 141)         {
                    setImage(ps_140); 
                }         else if (Image_Count == 142)         {
                    setImage(ps_141); 
                }         else if (Image_Count == 143)         {
                    setImage(ps_142); 
                }         else if (Image_Count == 144)         {
                    setImage(ps_143); 
                }         else if (Image_Count == 145)         {
                    setImage(ps_144); 
                }         else if (Image_Count == 146)         {
                    setImage(ps_145);  
                }         else if (Image_Count == 147)         {
                    level.playerAttackAnimation = false;
                    Image_Count = 0;
                }
        }
    }
}
