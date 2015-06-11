/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import java.util.Date;

/**
 * Classe représentant un vehicule de transport d'employés
 * @author qgangler
 */
public class VehiculeTransportEmploye extends Vehicule{
    private String nomSite;

    /**
     * Constructeur de la classe
     * @param immatriculation l'immatriculation du vehicule
     * @param kilometrageMaxAnnuel le kilométrage maximum annuel du vehicule
     * @param kilometrageMaxApresRevision le kilométrage maximum du vehicule après sa révision
     * @param dureeVieMax la durée vie maxium du vehicule en années
     * @param dateArrVehicule la date d'arrivée du vehicule dans le parc
     * @param categorie la catégorie du vehicule
     * @param nomSite le nom du site du vehicule
     */
    public VehiculeTransportEmploye(String immatriculation, int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Date dateArrVehicule, Categorie categorie , String nomSite) {
        super(immatriculation, kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.nomSite=nomSite;
    }
    
    /**
     * Getter sur le nom de site du vehicule
     * @return le nomSite du vehicule
     */
    public String getNomSite(){
        return nomSite;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +
                "\nNom du site : " + nomSite; 
    }
    
}
