/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.characters;

/**
 *
 * @author Wein
 */
public class Character {
    
    private String skill1,skill2,skill3,skill4,skill1Active,skill2Active,skill3Active,skill4Active;
    
    int choice;
    
    
    public void setChoice(int choice){
        this.choice=choice;
        skill1="/skillicons/default/All_Skill1.png";
        skill1Active="/skillicons/with BORDER/All_Skill1.gif";
        if(choice==1){ 
            skill2="/skillicons/default/Brett_Skill2.png";
            skill3="/skillicons/default/Brett_Skill3.png";
            skill4="/skillicons/default/Brett_Skill4.png";
            skill2Active="/skillicons/with BORDER/Brett_Skill2.gif";
            skill3Active="/skillicons/with BORDER/Brett_Skill3.gif";
            skill4Active="/skillicons/with BORDER/Brett_Skill4.gif";
        }else if(choice==2){
            skill2="/skillicons/default/Gabe_Skill2.png";
            skill3="/skillicons/default/Gabe_Skill3.png";
            skill4="/skillicons/default/Gabe_Skill4.png";
            skill2Active="/skillicons/with BORDER/Gabe_Skill2.gif";
            skill3Active="/skillicons/with BORDER/Gabe_Skill3.gif";
            skill4Active="/skillicons/with BORDER/Gabe_Skill4.gif";
        }else if(choice==3){
            skill2="/skillicons/default/Migantron_Skill2.png";
            skill3="/skillicons/default/Migantron_Skill3.png";
            skill4="/skillicons/default/Migantron_Skill4.png";
            skill2Active="/skillicons/with BORDER/Migantron_Skill2.gif";
            skill3Active="/skillicons/with BORDER/Migantron_Skill3.gif";
            skill4Active="/skillicons/with BORDER/Migantron_Skill4.gif";
        }else if(choice==4){
            skill1="/skillicons/default/SirKhai_Skill.png";
            skill2="/skillicons/default/SirKhai_Batch.png";
            skill3="/skillicons/default/SirKhai_Skil3.png";
            skill4="/skillicons/default/SirKhai_Skil4.png";
            skill1Active="/skillicons/with BORDER/SirKhai_Skill1.gif";
            skill2Active="/skillicons/with BORDER/SirKhai_Skill2.gif";
            skill3Active="/skillicons/with BORDER/SirKhai_Skill3.gif";
            skill4Active="/skillicons/with BORDER/SirKhai_Skill4.gif";
        }
    }
    
   
   
    public String getSkill1(){
        return skill1;
    }
     public String getSkill2(){
        return skill2;
    }
      public String getSkill3(){
        return skill3;
    }
       public String getSkill4(){
        return skill4;
    }
    
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
