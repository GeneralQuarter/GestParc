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
public class VehiculeService extends Vehicule{
    private boolean affecte; 
    private String nomResponsable; 
    private Calendar dateDebutAff; 
    private Calendar dateFinAff;
    private Categorie categorie;

    public VehiculeService(int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Calendar dateArrVehicule, Categorie categorie, boolean affecte, String nomResponsable, Calendar dateDebutAff, Calendar dateFinAff) {
        super(kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.affecte = affecte;
        this.nomResponsable = nomResponsable;
        this.dateDebutAff = dateDebutAff;
        this.dateFinAff = dateFinAff;
    }
    
    public boolean isAffecte() {
        return affecte;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public Calendar getDateDebutAff() {
        return dateDebutAff;
    }

    public Calendar getDateFinAff() {
        return dateFinAff;
    }
    
    
}
