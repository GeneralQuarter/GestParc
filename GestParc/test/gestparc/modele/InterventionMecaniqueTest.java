/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.PieceCarrosserie;
import gestparc.modele.enums.PieceMecanique;
import gestparc.modele.enums.TypeCarrosserie;
import gestparc.modele.enums.TypeMecanique;
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
public class InterventionMecaniqueTest {
    
    private InterventionMecanique instance;
    
    public InterventionMecaniqueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new InterventionMecanique(TypeMecanique.FIXATION, PieceMecanique.AUTRE);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getTypeIntervention method, of class InterventionMecanique.
     */
    @Test
    public void testGetTypeIntervention() {
        System.out.println("getTypeIntervention");
        TypeMecanique expResult = TypeMecanique.FIXATION;
        TypeMecanique result = instance.getTypeIntervention();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPiece method, of class InterventionMecanique.
     */
    @Test
    public void testGetPiece() {
        System.out.println("getPiece");
        PieceMecanique expResult = PieceMecanique.AUTRE;
        PieceMecanique result = instance.getPiece();
        assertEquals(expResult, result);
    }
    
}
