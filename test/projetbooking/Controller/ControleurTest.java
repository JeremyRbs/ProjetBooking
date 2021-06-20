/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import projetbooking.Modele.Modele;
import projetbooking.Vue.Vue;

/**
 *
 * @author Jerem
 */
public class ControleurTest {
    
    public ControleurTest() {
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
     * Test of getVue method, of class Controleur.
     */
    @Test
    public void testGetVue() {
        System.out.println("getVue");
        Controleur instance = null;
        Vue expResult = null;
        Vue result = instance.getVue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModele method, of class Controleur.
     */
    @Test
    public void testGetModele() {
        System.out.println("getModele");
        Controleur instance = null;
        Modele expResult = null;
        Modele result = instance.getModele();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Controleur.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Controleur instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseClicked method, of class Controleur.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        Controleur instance = null;
        instance.mouseClicked(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mousePressed method, of class Controleur.
     */
    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        Controleur instance = null;
        instance.mousePressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseReleased method, of class Controleur.
     */
    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        Controleur instance = null;
        instance.mouseReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseEntered method, of class Controleur.
     */
    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        Controleur instance = null;
        instance.mouseEntered(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseExited method, of class Controleur.
     */
    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        Controleur instance = null;
        instance.mouseExited(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
