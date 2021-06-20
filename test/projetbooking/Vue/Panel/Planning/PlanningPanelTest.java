/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel.Planning;

import java.awt.event.ActionListener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jerem
 */
public class PlanningPanelTest {
    
    public PlanningPanelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of centerFrame method, of class PlanningPanel.
     */
    @Test
    public void testCenterFrame() {
        System.out.println("centerFrame");
        PlanningPanel instance = null;
        instance.centerFrame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recompute method, of class PlanningPanel.
     */
    @Test
    public void testRecompute() {
        System.out.println("recompute");
        PlanningPanel instance = null;
        instance.recompute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeap method, of class PlanningPanel.
     */
    @Test
    public void testIsLeap() {
        System.out.println("isLeap");
        int year = 0;
        PlanningPanel instance = null;
        boolean expResult = false;
        boolean result = instance.isLeap(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class PlanningPanel.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        int yy = 0;
        int mm = 0;
        int dd = 0;
        PlanningPanel instance = null;
        instance.setDate(yy, mm, dd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDayActive method, of class PlanningPanel.
     */
    @Test
    public void testSetDayActive() {
        System.out.println("setDayActive");
        int newDay = 0;
        PlanningPanel instance = null;
        instance.setDayActive(newDay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterEcouteurBouton method, of class PlanningPanel.
     */
    @Test
    public void testAjouterEcouteurBouton() {
        System.out.println("ajouterEcouteurBouton");
        String nomBouton = "";
        ActionListener listener = null;
        PlanningPanel instance = null;
        instance.ajouterEcouteurBouton(nomBouton, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
