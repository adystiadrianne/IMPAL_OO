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
public class PelajaranIT {
    
    public PelajaranIT() {
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
     * Test of getNamaPelajaran method, of class Pelajaran.
     */
//    @Test
//    public void testGetNamaPelajaran() {
//        System.out.println("getNamaPelajaran");
//        Pelajaran instance = new Pelajaran("Kimia");
//        String expResult = "Kimia";
//        String result = instance.getNamaPelajaran();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of getMateri method, of class Pelajaran.
     */
    @Test
    public void testGetMateri() {
        System.out.println("getMateri");
        int bab_materi = 0;
        Application instance = new Application();
        Pelajaran p = new Pelajaran("Biologi");
        instance.setPelajaran(p);
        Materi materi = new Materi(1, "nama materi", "isi maeri");
        Materi expResult = instance.getPelajaran().getMateri(1);
        Materi result = instance.getPelajaran().getMateri(bab_materi);
        assertEquals(expResult, result);
    }

    /**
     * Test of setNamaPelajaran method, of class Pelajaran.
     */
    

    /**
     * Test of createMateri method, of class Pelajaran.
     */
    

    /**
     * Test of setMateri method, of class Pelajaran.
     */
    

    /**
     * Test of setNamaPelajaran method, of class Pelajaran.
     */
//    @Test
//    public void testSetNamaPelajaran() {
//        System.out.println("setNamaPelajaran");
//        String namaPelajaran = "";
//        Pelajaran instance = null;
//        instance.setNamaPelajaran(namaPelajaran);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of createMateri method, of class Pelajaran.
     */
//    @Test
//    public void testCreateMateri() {
//        System.out.println("createMateri");
//        int bab_materi = 0;
//        String judul_materi = "";
//        String isi_materi = "";
//        Pelajaran instance = null;
//        instance.createMateri(bab_materi, judul_materi, isi_materi);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMateri method, of class Pelajaran.
//     */
//    @Test
//    public void testSetMateri() {
//        System.out.println("setMateri");
//        int bab_materi = 0;
//        Pelajaran instance = null;
//        instance.setMateri(bab_materi);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   
    
}
