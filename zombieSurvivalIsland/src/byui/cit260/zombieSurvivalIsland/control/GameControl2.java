/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSurvivalIsland.control;

/**
 *
 * @author FamiliaLezcano
 */
public class GameControl2 {
    
    /**
     *
     * @param level1
     * @param level2
     * @param level3
     * @param level
     * @return
     */
    public int startNewGame(int level1, int level2, int level3, byte level){
       
      
        if (level1 != 1 || level2 != 2 || level3 != 3){
        return -1;
    }
        
        
        
byte message=  level;

        return message;
    }

   

}
    
