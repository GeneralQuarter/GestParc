/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author qgangler
 */
public class ModeleListeIntervention extends AbstractListModel<Intervention>{
    private List<Intervention> interventions;
    
    public ModeleListeIntervention(List<Intervention> interventions)
    {
        this.interventions = interventions;
    }

    @Override
    public int getSize() {
        if(interventions != null)
            return interventions.size();
        else
            return 0;
    }

    @Override
    public Intervention getElementAt(int index) {
        return interventions.get(index);
    }
    
}
