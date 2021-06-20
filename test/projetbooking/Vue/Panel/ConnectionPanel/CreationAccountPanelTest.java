/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel.ConnectionPanel;

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
public class CreationAccountPanelTest {
    
    public CreationAccountPanelTest() {
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
     * Test of getNameField method, of class CreationAccountPanel.
     */
    @Test
    public void testGetNameField() {
        System.out.println("getNameField");
        CreationAccountPanel instance = new CreationAccountPanel();
        JTextField expResult = null;
        JTextField result = instance.getNameField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstNameField method, of class CreationAccountPanel.
     */
    @Test
    public void testGetFirstNameField() {
        System.out.println("getFirstNameField");
        CreationAccountPanel instance = new CreationAccountPanel();
        JTextField expResult = null;
        JTextField result = instance.getFirstNameField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailField method, of class CreationAccountPanel.
     */
    @Test
    public void testGetEmailField() {
        System.out.println("getEmailField");
        CreationAccountPanel instance = new CreationAccountPanel();
        JTextField expResult = null;
        JTextField result = instance.getEmailField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordField method, of class CreationAccountPanel.
     */
    @Test
    public void testGetPasswordField() {
        System.out.println("getPasswordField");
        CreationAccountPanel instance = new CreationAccountPanel();
        JTextField expResult = null;
        JTextField result = instance.getPasswordField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMobileField method, of class CreationAccountPanel.
     */
    @Test
    public void testGetMobileField() {
        System.out.println("getMobileField");
        CreationAccountPanel instance = new CreationAccountPanel();
        JTextField expResult = null;
        JTextField result = instance.getMobileField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterEcouteurBouton method, of class CreationAccountPanel.
     */
    @Test
    public void testAjouterEcouteurBouton() {
        System.out.println("ajouterEcouteurBouton");
        String nomBouton = "";
        ActionListener listener = null;
        CreationAccountPanel instance = new CreationAccountPanel();
        instance.ajouterEcouteurBouton(nomBouton, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
