/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package game.characters;

/**
 *
 
@author Wein*/

public class Character {
    private int choice;
    private int playerNum;
    private String[] skills;

    public void setChoice(int choice) {
        this.choice = choice;
        setSkills();
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public int getChoice() {
        return choice;
    }

    private void setSkills() {
        switch (choice) {
            case 1: // GABE SKILLS
                skills = new String[]{"Basic Attack", "Damage Ears", "Charm", "Skull"};
                break;
            case 2: // BRETT SKILLS
                skills = new String[]{"Basic Attack", "Chicken Wings", "Heal", "Revive"};
                break;
            case 3: // MIGAN SKILLS
                skills = new String[]{"Basic Attack", "Coffee", "Vape", "Slap"};
                break;
            case 4: // SIR KHAI SKILLS
                skills = new String[]{"Basic Attack", "Batch", "Remedial", "Quote of The Weak"};
            default:
                skills = new String[0]; // DEFAULT NO SKILLS
                break;
        }
    }

    public String[] getSkills() {
        return skills;
    }
}