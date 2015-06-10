/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import gestparc.modele.enums.Couleur;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Classe représentant un vehicule
 * @author qgangler
 */
public abstract class Vehicule {
    private final String immatriculation;
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
    private boolean immobilise;
    
    /**
     * Constructeur de la classe
     * @param immatriculation l'immatriculation du vehicule
     * @param kilometrageMaxAnnuel le kilométrage maximum annuel du vehicule
     * @param kilometrageMaxApresRevision le kilométrage maximum du vehicule après sa révision
     * @param dureeVieMax la durée vie maxium du vehicule en années
     * @param dateArrVehicule la date d'arrivée du vehicule dans le parc
     * @param categorie la catégorie du vehicule
     */
    public Vehicule(String immatriculation, int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie) {
        this.immatriculation = immatriculation;
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
        this.immobilise = false;
    }
    
    /**
     * Permet d'ajouter une intervention au vehicule
     * @param intervention l'intervention à ajouter
     * @see Intervention
     */
    public void ajouterIntervention(Intervention intervention)
    {
        if(!interventions.contains(intervention))
        {
            interventions.add(intervention);
        }else{
            System.out.println("Cette intervention existe déja !");
        }
    }
    
    /**
     * Permet de supprimer une intervention au vehicule
     * @param intervention l'intervention à supprimer
     * @see Intervention
     */
    public void supprimerIntervention(Intervention intervention)
    {
        if(interventions.contains(intervention))
        {
            interventions.add(intervention);
        }else{
            System.out.println("Cette intervention n'est pas attribuée à ce vehicule !");
        }
    }
    
    /**
     * Getter sur l'immatriculation du vehicule
     * @return l'immatriculation du vehicule
     */
    public String getImmatriculation(){
        return immatriculation;
    }
    
    /**
     * Getter sur le kilométrage maximum annuel du vehicule
     * @return le kilometrageMaxAnnuel du vehicule
     */
    public int getKilometrageMaxAnnuel() {
        return kilometrageMaxAnnuel;
    }
    
    /**
     * Getter sur le kilométrage maximum après révision du vehicule
     * @return le kilometrageMaxApresRevision du vehicule
     */
    public int getKilometrageMaxApresRevision() {
        return kilometrageMaxApresRevision;
    }

    /**
     * Getter sur la durée de vie maximale du vehicule
     * @return la dureeVieMax du vehicule
     */
    public int getDureeVieMax() {
        return dureeVieMax;
    }

    /**
     * Getter sur la date d'arriver du vehicule
     * @return la dureeVieMax du vehicule
     */
    public Calendar getDateArrVehicule() {
        return dateArrVehicule;
    }

    /**
     * Getter sur le kilométrage annuel du vehicule
     * @return le kilometrageAnnuel du vehicule
     */
    public int getKilometrageAnnuel() {
        return kilometrageAnnuel;
    }

    /**
     * Getter sur le kilométrage après révision du vehicule
     * @return le kilometrageApresRevision du vehicule
     */
    public int getKilometrageApresRevision() {
        return kilometrageApresRevision;
    }

    /**
     * Getter sur le temps de circulation du vehicule
     * @return le tempsCirculation du vehicule
     */
    public int getTempsCirculation() {
        return tempsCirculation;
    }

    /**
     * Getter sur la couleur du vehicule : son état actuel
     * @return la couleur du vehicule
     */
    public Couleur getCouleur() {
        return couleur;
    }
    /**
     * Getter sur la catégorie du vehicule
     * @return la categorie du vehicule
     */
    public Categorie getCategorie()
    {
        return categorie;
    }
    
}
