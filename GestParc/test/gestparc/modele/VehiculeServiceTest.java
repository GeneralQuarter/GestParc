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
public class VehiculeServiceTest {
    
    private VehiculeService instance;
    
    public VehiculeServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new VehiculeService("XX-XXX-XX", 0, 0, 0, new Date(2015,1,1), Categorie.VOITURE, true, "test", new Date(2015,1,1), new Date(2015,1,1));
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of isAffecte method, of class VehiculeService.
     */
    @Test
    public void testIsAffecte() {
        System.out.println("isAffecte");
        boolean expResult = true;
        boolean result = instance.isAffecte();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNomResponsable method, of class VehiculeService.
     */
    @Test
    public void testGetNomResponsable() {
        System.out.println("getNomResponsable");
        String expResult = "test";
        String result = instance.getNomResponsable();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateDebutAff method, of class VehiculeService.
     */
    @Test
    public void testGetDateDebutAff() {
        System.out.println("getDateDebutAff");
        Date expResult = new Date(2015,1,1);
        Date result = instance.getDateDebutAff();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateFinAff method, of class VehiculeService.
     */
    @Test
    public void testGetDateFinAff() {
        System.out.println("getDateFinAff");
        Date expResult = new Date(2015,1,1);
        Date result = instance.getDateFinAff();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class VehiculeService.
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
                "\nAffecté : true" +
                "\nNom responsable : test" +
                "\nDate début d'affectation : 1 février 3915" +
                "\nDate fin d'affectation : 1 février 3915";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
