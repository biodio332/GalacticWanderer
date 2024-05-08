/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Wein
 */
public class Entity {
    int hp;
    int type;
    public Entity(int hp){
        this.hp=hp;
    }
    public void checker(){
        if(hp==100){
            
        }else if(hp==500){
            
        }
    }
    
    public int getHP(){
        return hp;
    }
    public void addHP(int hp){
        this.hp+=hp;
    }
    public void damage(int damage){
        this.hp-=damage;
    }
}
