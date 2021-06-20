/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Modele;

import javax.swing.JButton;
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
public class ModeleTest {
    
    public ModeleTest() {
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
     * Test of estVide method, of class Modele.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        Modele instance = new Modele();
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class Modele.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        JButton bouton = null;
        Modele instance = new Modele();
        instance.push(bouton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Modele.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        Modele instance = new Modele();
        JButton expResult = null;
        JButton result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Modele.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Modele instance = new Modele();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contient method, of class Modele.
     */
    @Test
    public void testContient() {
        System.out.println("contient");
        String nom = "";
        Modele instance = new Modele();
        boolean expResult = false;
        boolean result = instance.contient(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficher method, of class Modele.
     */
    @Test
    public void testAfficher() {
        System.out.println("afficher");
        Modele instance = new Modele();
        instance.afficher();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
