/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package game.characters;

/**
 *
 
@author Wein*/
public class StoryCharacter {
    private String image;
    private String[] skills;
    private int choice;

    public StoryCharacter(int choice) {
        this.choice = choice;
        setCharacter();
    }

    private void setCharacter() {
        Character character = new Character();
        character.setChoice(choice);
        skills = character.getSkills();

        //IMAGE BASED ON CHARACTER
        switch (choice) {
            case 1:
                image = "image_gabe.png";
                break;
            case 2:
                image = "image_brett.png";
                break;
            case 3:
                image = "image_migan.png";
                break;
            case 4:
                image = "image_sir_khai.png";
                break;
            default:
                image = "default_image.png";
                break;
        }
    }

    public String getImage() {
        return image;
    }

    public String[] getSkills() {
        return skills;
    }
}