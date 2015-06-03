/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author qgangler
 */
public class Parc {
    private List<Vehicule> vehicules;

    public Parc() {
        this.vehicules = new ArrayList<>();
    }
    
    public void ajouterVehicule(Vehicule vehicule){
        if(!vehicules.contains(vehicule)){
            vehicules.add(vehicule);
        }else{
            System.out.println("Le vehicule existe déjà dans le parc.");
        }
    }
    
    public void retirerVehicule(Vehicule vehicule){
        if(vehicules.contains(vehicule)){
            vehicules.remove(vehicule);
        }else{
            System.out.println("Le vehicule n'existe pas dans le parc.");
        }
    }
}
