/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import gestparc.enumPack.Categorie;
import java.util.Calendar;

/**
 *
 * @author qgangler
 */
public class VehiculeTransportPassage extends Vehicule{
    private String nomDepot;

    public VehiculeTransportPassage(int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie, String nomDepot) {
        super(kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.nomDepot=nomDepot;
    }

    public String getNomDepot() {
        return nomDepot;
    }
    
}
