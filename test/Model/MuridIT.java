/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
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
public class MuridIT {
    
    public MuridIT() {
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
     * Test of getUsername method, of class Murid.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Murid instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Murid.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Murid instance = null;
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama method, of class Murid.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Murid instance = null;
        String expResult = "";
        String result = instance.getNama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama method, of class Murid.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "";
        Murid instance = null;
        instance.setNama(nama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Murid.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Murid instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Murid.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Murid instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchSoalDanJawaban method, of class Murid.
     */
    @Test
    public void testSearchSoalDanJawaban() {
        System.out.println("searchSoalDanJawaban");
        int babMateri = 0;
        int noSoal = 0;
        Murid instance = null;
        soalDanJawaban expResult = null;
        soalDanJawaban result = instance.searchSoalDanJawaban(babMateri, noSoal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSoalDanJawaban method, of class Murid.
     */
    @Test
    public void testCreateSoalDanJawaban() {
        System.out.println("createSoalDanJawaban");
        soalDanJawaban soal = null;
        Murid instance = null;
        instance.createSoalDanJawaban(soal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListSoal method, of class Murid.
     */
    @Test
    public void testGetListSoal() {
        System.out.println("getListSoal");
        Murid instance = null;
        ArrayList<soalDanJawaban> expResult = null;
        ArrayList<soalDanJawaban> result = instance.getListSoal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
