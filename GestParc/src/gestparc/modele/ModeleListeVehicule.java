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
public class ModeleListeVehicule extends AbstractListModel{
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
    public Object getElementAt(int index) {
        Vehicule v = vehicules.get(index);
        return v.getImmatriculation() + " " + v.getCategorie().toString() + " " + v.getKilometrageAnnuel() + "km " + v.getTempsCirculation() + " jours ";
    }
    
}
