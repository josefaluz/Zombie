/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiesurvivalisland;

import byui.cit260.zombieSurvivalIsland.model.Player;

/**
 *
 * @author LOPEZ-1
 */
public class ZombieSurvivalIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player();
      
      playerOne.setName("GokuSS4");
      playerOne.setBestTime(7.00);
      
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
     
      
    }
    
}
