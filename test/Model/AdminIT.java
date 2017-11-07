/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class AdminIT {
    
    public AdminIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdAdmin method, of class Admin.
     */
    @Test
    public void testGetIdAdmin() {
        System.out.println("getIdAdmin");
        Admin instance = new Admin("Datita","123");
        String expResult = "Datita";
        String result = instance.getIdAdmin();
        assertEquals(expResult, result);
        
    }

  

    /**
     * Test of getPassword method, of class Admin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Admin instance = new Admin ("Datita","123");
        String expResult = "12";
        String result = instance.getPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPassword method, of class Admin.
     */
 
    
}
