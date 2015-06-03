
import gestparc.Vehicule;
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
    
    public VehiculeIntervention(int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, String nomService) {
        super(kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule);
        this.nomService = nomService;
    }

    public String getNomService() {
        return nomService;
    }
    
}
