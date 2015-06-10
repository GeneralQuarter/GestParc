
import gestparc.modele.Vehicule;
import gestparc.modele.enums.Categorie;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe représentant un vehicule d'intervention
 * @author qgangler
 */
public class VehiculeIntervention extends Vehicule{
    private String nomService;
    
    /**
     * Constructeur de la classe
     * @param immatriculation l'immatriculation du vehicule
     * @param kilometrageMaxAnnuel le kilométrage maximum annuel du vehicule
     * @param kilometrageMaxApresRevision le kilométrage maximum du vehicule après sa révision
     * @param dureeVieMax la durée vie maxium du vehicule en années
     * @param dateArrVehicule la date d'arrivée du vehicule dans le parc
     * @param categorie la catégorie du vehicule
     * @param nomService le nom du service du vehicule
     */
    public VehiculeIntervention(String immatriculation, int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie, String nomService) {
        super(immatriculation, kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.nomService = nomService;
    }

    /**
     * Getter sur le nom de service du vehicule
     * @return le nomService du vehicule
     */
    public String getNomService() {
        return nomService;
    }
    
}
