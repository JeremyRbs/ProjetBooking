/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel.Room;

import java.awt.event.ActionListener;
import java.sql.SQLException;
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
public class EditRoomPanelTest {
    
    public EditRoomPanelTest() {
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
     * Test of ajouterEcouteurBouton method, of class EditRoomPanel.
     * @throws java.sql.SQLException
     */
    @Test
    public void testAjouterEcouteurBouton() throws SQLException {
        System.out.println("ajouterEcouteurBouton");
        String nomBouton = "";
        ActionListener listener = null;
        EditRoomPanel instance = new EditRoomPanel();
        instance.ajouterEcouteurBouton(nomBouton, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
