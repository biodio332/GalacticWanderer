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
    String name,time,time2;
    
 //Constructor
    public Player(String name,String time,String time2){
    this.name = name;
    this.time = time;
    this.time2= time2;
 }

 //getters
 public String getName(){
 return this.name;
 }
 public String getTime(){
 return this.time;
 }
  public String getTime2(){
 return this.time2;
 }

}

