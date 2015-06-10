/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import java.util.Date;

/**
 * Classe représentant un vehicule de transport de passagers.
 * @author qgangler
 */
public class VehiculeTransportPassage extends Vehicule{
    private String nomDepot;

    /**
     * Constructeur de la classe
     * @param immatriculation l'immatriculation du vehicule
     * @param kilometrageMaxAnnuel le kilométrage maximum annuel du vehicule
     * @param kilometrageMaxApresRevision le kilométrage maximum du vehicule après sa révision
     * @param dureeVieMax la durée vie maxium du vehicule en années
     * @param dateArrVehicule la date d'arrivée du vehicule dans le parc
     * @param categorie la catégorie du vehicule
     * @param nomDepot le nom du dépot du vehicule
     */
    public VehiculeTransportPassage(String immatriculation, int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Date dateArrVehicule, Categorie categorie, String nomDepot) {
        super(immatriculation, kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.nomDepot=nomDepot;
    }

    /**
     * Getter sur le nom de dépot du vehicule
     * @return le nomDepot du vehicule
     */
    public String getNomDepot() {
        return nomDepot;
    }
    
}
