/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.controleur;

import gestparc.modele.Parc;
import gestparc.vue.AjoutVehiculeVue;
import gestparc.vue.TableauBord;

/**
 * Controleur de l'application
 * @author qgangler
 */
public class Controleur {
    private AjoutVehiculeVue avv;
    private TableauBord tb;
    private Parc p;
    
    /**
     * Constructeur par défaut
     */
    public Controleur(){}
    
    /**
     * Fonction permetant de lier le tableau de bord et le controleur
     * @param tb tableau de bord
     * @see TableauBord
     */
    public void setTableauBord(TableauBord tb)
    {
        this.tb = tb;
        this.p = new Parc();
    }
    
    public void afficherAjouterVehicule()
    {
        if(avv == null)
            avv = new AjoutVehiculeVue(this);
        if(avv != null && !avv.isVisible())
            avv = new AjoutVehiculeVue(this);
    }
    
    public void ajouterVehiculeIntervention()
    {
        
    }
    
    public void ajouterVehiculeService()
    {
        
    }
    
    public void ajouterVehiculeTransportEmploye()
    {
        
    }
    
    public void ajouterVehiculeTransportPassager()
    {
        
    }
    
    public void ajouterIntervention()
    {
        
    }
}
