/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import java.util.Calendar;

/**
 * Classe représentant un vehicule de service.
 * @author qgangler
 */
public class VehiculeService extends Vehicule{
    private boolean affecte; 
    private String nomResponsable; 
    private Calendar dateDebutAff; 
    private Calendar dateFinAff;

    /**
     * Constructeur de la classe
     * @param immatriculation l'immatriculation du vehicule
     * @param kilometrageMaxAnnuel le kilométrage maximum annuel du vehicule
     * @param kilometrageMaxApresRevision le kilométrage maximum du vehicule après sa révision
     * @param dureeVieMax la durée vie maxium du vehicule en années
     * @param dateArrVehicule la date d'arrivée du vehicule dans le parc
     * @param categorie la catégorie du vehicule
     * @param affecte valeur booleenne permettant de savoir si le vehicule est ou non affecté
     * @param nomResponsable nom du responsable affecté au vehicule
     * @param dateDebutAff date de début d'affectation du vehicule
     * @param dateFinAff date de fin d'affectation du vehicule
     */
    public VehiculeService(String immatriculation, int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie, boolean affecte, String nomResponsable, Calendar dateDebutAff, Calendar dateFinAff) {
        super(immatriculation, kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.affecte = affecte;
        this.nomResponsable = nomResponsable;
        this.dateDebutAff = dateDebutAff;
        this.dateFinAff = dateFinAff;
    }
    
    /**
     * Getter sur l'affectation du vehicule
     * @return la valeur affecte du vehicule
     */
    public boolean isAffecte() {
        return affecte;
    }

    /**
     * Getter sur le nom de responsable du vehicule
     * @return le nomResponsable du vehicule
     */
    public String getNomResponsable() {
        return nomResponsable;
    }

    /**
     * Getter sur la date de début d'affectation du vehicule
     * @return la dateDebutAff du vehicule
     */
    public Calendar getDateDebutAff() {
        return dateDebutAff;
    }

    /**
     * Getter sur la date de fin d'affectation du vehicule
     * @return la dateFinAff du vehicule
     */
    public Calendar getDateFinAff() {
        return dateFinAff;
    }
    
    
}
