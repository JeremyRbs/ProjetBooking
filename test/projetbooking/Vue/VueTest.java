/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JPanel;
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
public class VueTest {
    
    public VueTest() {
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
     * Test of centerFrame method, of class Vue.
     * @throws java.sql.SQLException
     */
    @Test
    public void testCenterFrame() throws SQLException {
        System.out.println("centerFrame");
        Vue instance = new Vue();
        instance.centerFrame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPane method, of class Vue.
     * @throws java.sql.SQLException
     */
    @Test
    public void testSetPane() throws SQLException {
        System.out.println("setPane");
        JPanel pane = null;
        Vue instance = new Vue();
        instance.setPane(pane);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of backPanel method, of class Vue.
     * @throws java.sql.SQLException
     */
    @Test
    public void testBackPanel() throws SQLException {
        System.out.println("backPanel");
        Vue instance = new Vue();
        instance.backPanel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activatePanel method, of class Vue.
     * @throws java.sql.SQLException
     */
    @Test
    public void testActivatePanel() throws SQLException {
        System.out.println("activatePanel");
        String namePanel = "";
        Vue instance = new Vue();
        instance.activatePanel(namePanel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterEcouteurBouton method, of class Vue.
     * @throws java.sql.SQLException
     */
    @Test
    public void testAjouterEcouteurBouton() throws SQLException {
        System.out.println("ajouterEcouteurBouton");
        String nomBouton = "";
        ActionListener listener = null;
        Vue instance = new Vue();
        instance.ajouterEcouteurBouton(nomBouton, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Vue.
     * @throws java.sql.SQLException
     */
    @Test
    public void testGetText() throws SQLException {
        System.out.println("getText");
        String nomPanel = "";
        Vue instance = new Vue();
        ArrayList expResult = null;
        ArrayList result = instance.getText(nomPanel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
