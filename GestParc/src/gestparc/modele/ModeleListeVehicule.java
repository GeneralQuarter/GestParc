/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 * Classe de modèle de la liste de vehicule
 * @author qgangler
 */
public class ModeleListeVehicule extends AbstractListModel<Vehicule>{
    private List<Vehicule> vehicules;
    
    public ModeleListeVehicule(List<Vehicule> vehicules)
    {
        this.vehicules = vehicules;
    }
    
    @Override
    public int getSize() {
        return vehicules.size();
    }

    @Override
    public Vehicule getElementAt(int index) {
        Vehicule v = vehicules.get(index);
        String typeVehicule = null;
        if(v instanceof VehiculeIntervention)
            typeVehicule = "Véhicule d'intervention";
        if(v instanceof VehiculeService)
            typeVehicule = "Véhicule de service";
        if(v instanceof VehiculeTransportEmploye)
            typeVehicule = "Véhicule de transport employé";
        if(v instanceof VehiculeTransportPassage)
            typeVehicule = "Véhicule de transport passager";
        return v;
    }
    
}
