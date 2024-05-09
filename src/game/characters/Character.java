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
    
    String skill1,skill2,skill3,skill4,skill1Active,skill2Active,skill3Active,skill4Active;
    
    int choice;
    int playerNum;
    
    public void setChoice(int choice){
        this.choice=choice;
    }
   

    
    
    public void setPlayerNum(int playerNum){
        this.playerNum=playerNum;
    }
    
    public int getPlayerNum(){
        return playerNum;
    }
    public int getChoice(){
        return choice;
    }
    
    
}
