/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.PieceCarrosserie;
import gestparc.modele.enums.TypeCarrosserie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vpivet
 */
public class InterventionCarrosserieTest {
    
    private InterventionCarrosserie instance;
    
    public InterventionCarrosserieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new InterventionCarrosserie(TypeCarrosserie.RAYURE, PieceCarrosserie.CAPOT);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTypeIntervention method, of class InterventionCarrosserie.
     */
    @Test
    public void testGetTypeIntervention() {
        System.out.println("getTypeIntervention");
        TypeCarrosserie expResult = TypeCarrosserie.RAYURE;
        TypeCarrosserie result = instance.getTypeIntervention();
    }

    /**
     * Test of getPiece method, of class InterventionCarrosserie.
     */
    @Test
    public void testGetPiece() {
        System.out.println("getPiece");
        PieceCarrosserie expResult = PieceCarrosserie.CAPOT;
        PieceCarrosserie result = instance.getPiece();
        assertEquals(expResult, result);
    }
    
}
