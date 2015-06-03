
import gestparc.modele.Vehicule;
import gestparc.modele.enums.Categorie;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qgangler
 */
public class VehiculeIntervention extends Vehicule{
    private String nomService;
    
    public VehiculeIntervention(int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie, String nomService) {
        super(kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.nomService = nomService;
    }

    public String getNomService() {
        return nomService;
    }
    
}
