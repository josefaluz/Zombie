/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiesurvivalisland;

import byui.cit260.zombieSurvivalIsland.model.Game;
import byui.cit260.zombieSurvivalIsland.model.Item;
import byui.cit260.zombieSurvivalIsland.model.Maps;
import byui.cit260.zombieSurvivalIsland.model.Personage;
import byui.cit260.zombieSurvivalIsland.model.Player;
import byui.cit260.zombieSurvivalIsland.model.Ship;

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
     
      Game gameOne = new Game();
      
      gameOne.setTotalTime(7);
      gameOne.setNoPlayers(2);
      gameOne.setLastSession(1);
      
      String gameInfo = gameOne.toString();
      System.out.println(gameInfo);
      
      Maps mapsOne = new Maps();
      
      mapsOne.setRowCount(5);
      mapsOne.setColumnCount(5);
      
      String mapsInfo = mapsOne.toString();
      System.out.println(mapsInfo);
      
      Ship shipOne = new Ship();
      
      shipOne.setDescription("Use this ship to get back home.");
      shipOne.setWidth(15);
      shipOne.setHeight(30);
      shipOne.setLenght(70);
      shipOne.setCapacity(1);
      
      String shipInfo = shipOne.toString();
      System.out.println(shipInfo);
      
    
      
      Item itemOne = new Item();
      itemOne.setInventoryType("tool");
      itemOne.setQuantity(10);
      itemOne.setRequiredAmount(15);
      
      String itemInfo = itemOne.toString();
      System.out.println(itemInfo);
      
      Personage personageOne = new Personage();
      personageOne.setName("GokuSS4");
      personageOne.setCharacteristics("high");
      String personageInfo = personageOne.toString();
      System.out.println(personageInfo);
      
      
     
    }
}
