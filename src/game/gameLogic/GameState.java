package game.gameLogic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wein
 */
interface  GameState {  
    
    public void pause();
    
    public void gameWin();
    
    public void timer();
    
    public  void turn();
    
    public void unPause();
    
    
}
