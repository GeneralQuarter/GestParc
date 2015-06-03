/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.Intervention;
import gestparc.modele.enums.Categorie;
import gestparc.modele.enums.Couleur;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
    private Categorie categorie;
    private List<Intervention> interventions;

    public Vehicule(int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie) {
        this.kilometrageMaxAnnuel = kilometrageMaxAnnuel;
        this.kilometrageMaxApresRevision = kilometrageMaxApresRevision;
        this.dureeVieMax = dureeVieMax;
        this.dateArrVehicule = dateArrVehicule;
        this.kilometrageAnnuel = 0;
        this.kilometrageApresRevision = 0;
        this.tempsCirculation = 0;
        this.couleur = Couleur.VERT;
        this.categorie = categorie;
        this.interventions = new ArrayList<>();
    }
    
    public void ajouterIntervention(Intervention intervention)
    {
        if(!interventions.contains(intervention))
        {
            interventions.add(intervention);
        }else{
            System.out.println("Cette intervention existe déja !");
        }
    }
    
    public void supprimerIntervention(Intervention intervention)
    {
        if(interventions.contains(intervention))
        {
            interventions.add(intervention);
        }else{
            System.out.println("Cette intervention n'est pas attribuée à ce vehicule !");
        }
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
