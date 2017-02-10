/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSurvivalIsland.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FamiliaLezcano
 */
public class GameControl2Test {
    
    public GameControl2Test() {
    }

    /**
     * Test of startNewGame method, of class GameControl2.
     */
    @Test
    public void testStartNewGame() {
        System.out.println("startNewGame");
        int level1 = 1;
        int level2 = 2;
        int level3 = 3;
        byte level = 0;
        GameControl2 instance = new GameControl2();
        int expResult = 0;
        int result = instance.startNewGame(level1, level2, level3, level);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of SaveGame method, of class GameControl2.
     */
    @Test
    public void testSaveGame() {
        System.out.println("SaveGame");
        String player = "pablo";
        GameControl2 instance = new GameControl2();
        String expResult = "your session was saved in My Documents";
        String result = instance.SaveGame(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of initializeMap method, of class GameControl2.
     */
    @Test
    public void testInitializeMap() {
        System.out.println("initializeMap");
        String column = "a";
        int row = 5;
        GameControl2 instance = new GameControl2();
        String expResult = "a5";
        String result = instance.initializeMap(column, row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of createNewPlayer method, of class GameControl2.
     */
    @Test
    public void testCreateNewPlayer() {
        System.out.println("createNewPlayer");
        GameControl2 instance = new GameControl2();
        String player = "javier";
        String expResult = "You will be: ";
        String result = instance.createNewPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
