/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import gestparc.modele.enums.Couleur;
import gestparc.modele.enums.PieceMecanique;
import gestparc.modele.enums.TypeMecanique;
import java.awt.Color;
import java.util.Calendar;
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
public class VehiculeTest {
    private VehiculeImpl instance;
    public VehiculeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new VehiculeImpl();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of ajouterIntervention method, of class Vehicule.
     */
    @Test
    public void testAjouterIntervention() {
        System.out.println("ajouterIntervention");
        Intervention intervention = new InterventionMecanique(TypeMecanique.FIXATION, PieceMecanique.AUTRE);
        instance.ajouterIntervention(intervention);
        assertEquals(intervention, instance.getIntervention(0));
    }

    /**
     * Test of supprimerIntervention method, of class Vehicule.
     */
    @Test
    public void testSupprimerIntervention() {
        System.out.println("supprimerIntervention");
        Intervention intervention = new InterventionMecanique(TypeMecanique.FIXATION, PieceMecanique.AUTRE);
        instance.ajouterIntervention(intervention);
        instance.supprimerIntervention(intervention);
        assertEquals(null, instance.getIntervention(0));
    }

    /**
     * Test of getImmatriculation method, of class Vehicule.
     */
    @Test
    public void testGetImmatriculation() {
        System.out.println("getImmatriculation");
        String expResult = "XC-3FG-ZE";
        String result = instance.getImmatriculation();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKilometrageMaxAnnuel method, of class Vehicule.
     */
    @Test
    public void testGetKilometrageMaxAnnuel() {
        System.out.println("getKilometrageMaxAnnuel");
        int expResult = 0;
        int result = instance.getKilometrageMaxAnnuel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKilometrageMaxApresRevision method, of class Vehicule.
     */
    @Test
    public void testGetKilometrageMaxApresRevision() {
        System.out.println("getKilometrageMaxApresRevision");
        int expResult = 0;
        int result = instance.getKilometrageMaxApresRevision();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDureeVieMax method, of class Vehicule.
     */
    @Test
    public void testGetDureeVieMax() {
        System.out.println("getDureeVieMax");
        int expResult = 0;
        int result = instance.getDureeVieMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateArrVehicule method, of class Vehicule.
     */
    @Test
    public void testGetDateArrVehicule() {
        System.out.println("getDateArrVehicule");
        Date expResult = new Date(2015,1,1);
        Date result = instance.getDateArrVehicule();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKilometrageAnnuel method, of class Vehicule.
     */
    @Test
    public void testGetKilometrageAnnuel() {
        System.out.println("getKilometrageAnnuel");
        int expResult = 0;
        int result = instance.getKilometrageAnnuel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKilometrageApresRevision method, of class Vehicule.
     */
    @Test
    public void testGetKilometrageApresRevision() {
        System.out.println("getKilometrageApresRevision");
        int expResult = 0;
        int result = instance.getKilometrageApresRevision();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTempsCirculation method, of class Vehicule.
     */
    @Test
    public void testGetTempsCirculation() {
        System.out.println("getTempsCirculation");
        int expResult = 0;
        int result = instance.getTempsCirculation();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCouleur method, of class Vehicule.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Couleur expResult = Couleur.VERT;
        Couleur result = instance.getCouleur();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategorie method, of class Vehicule.
     */
    @Test
    public void testGetCategorie() {
        System.out.println("getCategorie");
        Categorie expResult = Categorie.BUS;
        Categorie result = instance.getCategorie();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Vehicule.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Categorie : BUS" +
               "\nImmatriculation : XC-3FG-ZE" + 
               "\nDate d'arrivée : 1 février 3915" + 
               "\nKilometrage maximum annuel : 0" +
               "\nKilometrage maximum après revision : 0" + 
               "\nDurée de vie maximum : 0" +
               "\nKilometrage annuel actuel : 0" + 
               "\nKilometrage apres revision actuel  : 0" + 
               "\nTemps de circulation : 0" + 
               "\nImobilisé : false";
        String result = instance.toString();
        assertEquals(expResult, result);
    }


    /**
     * Test of updateCouleur method, of class Vehicule.
     */
    @Test
    public void testUpdateCouleur() {
        System.out.println("updateCouleur");
        instance.updateCouleur();
        Couleur expResult = Couleur.ROUGE;
        Couleur result = instance.getCouleur();
        assertEquals(expResult, result);
    }

    public class VehiculeImpl extends Vehicule {

        public VehiculeImpl() {
            super("XC-3FG-ZE", 0, 0, 0, new Date(2015,1,1), Categorie.BUS);
        }
    }
    
}
