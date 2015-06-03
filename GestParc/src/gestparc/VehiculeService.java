/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import java.util.Calendar;

/**
 *
 * @author qgangler
 */
public class VehiculeService extends Vehicule{
    private boolean affecte; 
    private String nomResponsable; 
    private Calendar dateDebutAff; 
    private Calendar dateFinAff;

    public VehiculeService(int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, boolean affecte, String nomResponsable, Calendar dateDebutAff, Calendar dateFinAff) {
        super(kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule);
        this.affecte = affecte;
        this.nomResponsable = nomResponsable;
        this.dateDebutAff = dateDebutAff;
        this.dateFinAff = dateFinAff;
    }
    
}
