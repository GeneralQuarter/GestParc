/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui représente un parc de voitures (d'une agence par ex)
 * @author qgangler
 */
public class Parc {
    private List<Vehicule> vehicules;

    /**
     * Constructeur de la classe
     */
    public Parc() {
        this.vehicules = new ArrayList<>();
    }
    
    /**
     * Permet d'ajouter un vehicule au parc
     * @param vehicule le véhicule à rajouter
     * @see Vehicule
     */
    public void ajouterVehicule(Vehicule vehicule){
        if(!vehicules.contains(vehicule)){
            vehicules.add(vehicule);
        }else{
            System.out.println("Le vehicule existe déjà dans le parc.");
        }
    }
    
    /**
     * Permet de supprimer un vehicule du parc
     * @param vehicule le véhicule à supprimer
     * @see Vehicule
     */
    public void retirerVehicule(Vehicule vehicule){
        if(vehicules.contains(vehicule)){
            vehicules.remove(vehicule);
        }else{
            System.out.println("Le vehicule n'existe pas dans le parc.");
        }
    }
}
