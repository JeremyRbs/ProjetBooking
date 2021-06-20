/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel.Booking;

import java.awt.event.ActionListener;
import javax.swing.JTextField;
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
public class AddBookingPanelTest {
    
    public AddBookingPanelTest() {
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

//    /**
//     * Test of getNameField method, of class AddBookingPanel.
//     */
//    @Test
//    public void testGetNameField() {
//        System.out.println("getNameField");
//        AddBookingPanel instance = null;
//        JTextField expResult = null;
//        JTextField result = instance.getNameField();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of ajouterEcouteurBouton method, of class AddBookingPanel.
     */
    @Test
    public void testAjouterEcouteurBouton() {
        System.out.println("ajouterEcouteurBouton");
        String nomBouton = "";
        ActionListener listener = null;
        AddBookingPanel instance = null;
        instance.ajouterEcouteurBouton(nomBouton, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
