/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import gestparc.enumPack.Couleur;
import java.util.Calendar;

/**
 *
 * @author qgangler
 */
public abstract class Vehicule {
    private final int kilometrageMaxAnnuel;
    private final int kilometrageMaxApresRevision;
    private final int dureeVieMax;
    private final Calendar dateArrVehicule;
    private int kilometrageAnnuel;
    private int kilometrageApresRevision;
    private int tempsCirculation;
    private Couleur couleur;

    public Vehicule(int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule) {
        this.kilometrageMaxAnnuel = kilometrageMaxAnnuel;
        this.kilometrageMaxApresRevision = kilometrageMaxApresRevision;
        this.dureeVieMax = dureeVieMax;
        this.dateArrVehicule = dateArrVehicule;
        this.kilometrageAnnuel = 0;
        this.kilometrageApresRevision = 0;
        this.tempsCirculation = 0;
        this.couleur = Couleur.VERT;
    }

    public int getKilometrageMaxAnnuel() {
        return kilometrageMaxAnnuel;
    }

    public int getKilometrageMaxApresRevision() {
        return kilometrageMaxApresRevision;
    }

    public int getDureeVieMax() {
        return dureeVieMax;
    }

    public Calendar getDateArrVehicule() {
        return dateArrVehicule;
    }

    public int getKilometrageAnnuel() {
        return kilometrageAnnuel;
    }

    public int getKilometrageApresRevision() {
        return kilometrageApresRevision;
    }

    public int getTempsCirculation() {
        return tempsCirculation;
    }

    public Couleur getCouleur() {
        return couleur;
    }
    
    
}
