/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import java.util.Date;
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
public class VehiculeTransportPassageTest {
    
    private VehiculeTransportPassage instance;
    
    public VehiculeTransportPassageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new VehiculeTransportPassage("XX-XXX-XX", 0, 0, 0, new Date(2015,1,1), Categorie.VOITURE, "test");
    }
    
    @After
    public void tearDown() {
        instance = new VehiculeTransportPassage("XX-XXX-XX", 0, 0, 0, new Date(2015,1,1), Categorie.VOITURE, "test");
    }

    /**
     * Test of getNomDepot method, of class VehiculeTransportPassage.
     */
    @Test
    public void testGetNomDepot() {
        System.out.println("getNomDepot");
        String expResult = "test";
        String result = instance.getNomDepot();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class VehiculeTransportPassage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Categorie : VOITURE" +
               "\nImmatriculation : XX-XXX-XX" + 
               "\nDate d'arrivée : 1 février 3915" + 
               "\nKilometrage maximum annuel : 0" +
               "\nKilometrage maximum après revision : 0" + 
               "\nDurée de vie maximum : 0" +
               "\nKilometrage annuel actuel : 0" + 
               "\nKilometrage apres revision actuel  : 0" + 
               "\nTemps de circulation : 0" + 
               "\nImobilisé : false" +
                "\nNom depot : test";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
