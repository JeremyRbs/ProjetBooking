/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import java.sql.Statement;
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
public class RequetesTest {
    
    public RequetesTest() {
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
     * Test of connexion method, of class Requetes.
     */
    @Test
    public void testConnexion() {
        System.out.println("connexion");
        Statement expResult = null;
        Statement result = Requetes.connexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class Requetes.
     */
    @Test
    public void testCreateAccount() {
        System.out.println("createAccount");
        Statement statement = null;
        String name = "";
        String firstName = "";
        String mail = "";
        String password = "";
        String telephone = "";
        boolean expResult = false;
        boolean result = Requetes.createAccount(statement, name, firstName, mail, password, telephone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectAccount method, of class Requetes.
     */
    @Test
    public void testConnectAccount() {
        System.out.println("connectAccount");
        Statement statement = null;
        String mail = "";
        String password = "";
        int expResult = 0;
        int result = Requetes.connectAccount(statement, mail, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of deleteAccount method, of class Requetes.
//     */
//    @Test
//    public void testDeleteAccount() {
//        System.out.println("deleteAccount");
//        Statement statement = null;
//        String mail = "";
//        boolean expResult = false;
//        boolean result = Requetes.deleteAccount(statement, mail);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of addReservation method, of class Requetes.
//     */
//    @Test
//    public void testAddReservation() {
//        System.out.println("addReservation");
//        Statement statement = null;
//        Object[][] data = null;
//        Requetes.addReservation(statement, data);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of editReservation method, of class Requetes.
     */
    @Test
    public void testEditReservation() {
        System.out.println("editReservation");
        Statement statement = null;
        Object[][] data = null;
        Requetes.editReservation(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReservation method, of class Requetes.
     */
    @Test
    public void testRemoveReservation() {
        System.out.println("removeReservation");
        Statement statement = null;
        Object[][] data = null;
        Requetes.removeReservation(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateReservation method, of class Requetes.
     */
    @Test
    public void testValidateReservation() {
        System.out.println("validateReservation");
        Statement statement = null;
        Object[][] data = null;
        Requetes.validateReservation(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of promoteUser method, of class Requetes.
     */
    @Test
    public void testPromoteUser() {
        System.out.println("promoteUser");
        Statement statement = null;
        Object[][] data = null;
        Requetes.promoteUser(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of addEquipment method, of class Requetes.
//     */
//    @Test
//    public void testAddEquipment() {
//        System.out.println("addEquipment");
//        Statement statement = null;
//        Object[][] data = null;
//        Requetes.addEquipment(statement, data);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of editEquipment method, of class Requetes.
     */
    @Test
    public void testEditEquipment() {
        System.out.println("editEquipment");
        Statement statement = null;
        Object[][] data = null;
        Requetes.editEquipment(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEquipment method, of class Requetes.
     */
    @Test
    public void testRemoveEquipment() {
        System.out.println("removeEquipment");
        Statement statement = null;
        Object[][] data = null;
        Requetes.removeEquipment(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of addRoom method, of class Requetes.
//     */
//    @Test
//    public void testAddRoom() {
//        System.out.println("addRoom");
//        Statement statement = null;
//        Object[][] data = null;
//        Requetes.addRoom(statement, data);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of editRoom method, of class Requetes.
     */
    @Test
    public void testEditRoom() {
        System.out.println("editRoom");
        Statement statement = null;
        Object[][] data = null;
        Requetes.editRoom(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRoom method, of class Requetes.
     */
    @Test
    public void testRemoveRoom() {
        System.out.println("removeRoom");
        Statement statement = null;
        Object[][] data = null;
        Requetes.removeRoom(statement, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
