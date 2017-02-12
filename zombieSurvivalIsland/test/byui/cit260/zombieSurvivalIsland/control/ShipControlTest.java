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
 * @author LOPEZ-1
 */
public class ShipControlTest {
    
    public ShipControlTest() {
    }

    /**
     * Test of workOnShip method, of class ShipControl.
     */
    @Test
    public void testWorkOnShip() {
        System.out.println("workOnShip");
        int wood = 10;
        int tool = 5;
        ShipControl instance = new ShipControl();
        String expResult = "You have " + wood + " wood(s) and " + tool + " tool(s) to fix ship";
        String result = instance.workOnShip(wood, tool);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of viewShipStatus method, of class ShipControl.
     */
    @Test
    public void testViewShipStatus() {
        System.out.println("viewShipStatus");
        int collected = 100;
        int required = 0;
        ShipControl instance = new ShipControl();
        String expResult = "Your progess is " + collected + " out of 100%";
        String result = instance.viewShipStatus(collected, required);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of viewShipStatus method, of class ShipControl.
     */
    
    
}
