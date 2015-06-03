/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import java.util.Calendar;

/**
 *
 * @author qgangler
 */
public class VehiculeTransportEmploye extends Vehicule{
    private String nomSite;

    public VehiculeTransportEmploye(String immatriculation, int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie , String nomSite) {
        super(immatriculation, kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.nomSite=nomSite;
    }
    
    public String getNomSite(){
        return nomSite;
    }
    
}
