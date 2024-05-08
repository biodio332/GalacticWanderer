/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author Wein
 */
public class Player {
    String name,time;
    
 //Constructor
    public Player(String name,String time){
    this.name = name;
    this.time = time;

 }

 //getters
 public String getName(){
 return this.name;
 }
 public String getTime(){
 return this.time;
 }

}

