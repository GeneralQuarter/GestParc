/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class ParcTest {
    
    Parc instance;
    VehiculeTransportPassage vehicule;
    
    public ParcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.instance = new Parc();
        this.vehicule = new VehiculeTransportPassage("XX-XXX-XX", 0, 0, 0, new Date(2015,1,1), Categorie.BUS, "test");
    }
    
    @After
    public void tearDown() {
        this.instance = null;
        this.vehicule = null;
    }

    /**
     * Test of ajouterVehicule method, of class Parc.
     */
    @Test
    public void testAjouterVehicule() {
        System.out.println("ajouterVehicule");
        instance.ajouterVehicule(vehicule);
        VehiculeTransportPassage expResult = (VehiculeTransportPassage) instance.getVehicules().get(0);
        VehiculeTransportPassage result = vehicule;
        assertEquals(expResult, result);
    }

    /**
     * Test of retirerVehicule method, of class Parc.
     */
    @Test
    public void testRetirerVehicule() {
        System.out.println("retirerVehicule");
        instance.ajouterVehicule(vehicule);
        instance.retirerVehicule(vehicule);
        int expResult = instance.getVehicules().size();
        int result = 0;
        assertEquals(expResult, result);
    }

    /**
     * Test of getVehicules method, of class Parc.
     */
    @Test
    public void testGetVehicules() {
        System.out.println("getVehicules");
        System.out.println("ajouterVehicule");
        List<Vehicule> listtest = new ArrayList();
        instance.ajouterVehicule(vehicule);
        listtest.add(vehicule);
        List<Vehicule> expResult = listtest;
        List<Vehicule> result = instance.getVehicules();
        assertEquals(expResult, result);
    }

    
}
