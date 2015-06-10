/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.controleur;

import gestparc.modele.Parc;
import gestparc.modele.VehiculeIntervention;
import gestparc.modele.enums.Categorie;
import gestparc.vue.AjoutVehiculeVue;
import gestparc.vue.TableauBord;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public Controleur(){
        this.p = new Parc();
    }
    
    /**
     * Fonction permetant de lier le tableau de bord et le controleur
     * @param tb tableau de bord
     * @see TableauBord
     */
    public void setTableauBord(TableauBord tb)
    {
        this.tb = tb;
    }
    
    public void afficherAjouterVehicule()
    {
        if(avv == null)
            avv = new AjoutVehiculeVue(this);
        if(avv != null && !avv.isVisible())
            avv = new AjoutVehiculeVue(this);
    }
    
    public void ajouterVehiculeIntervention(String immatriculation, Categorie categorie, String dayArr, String monthArr, String yearArr, String nomService)
    {
        if(immatriculation.isEmpty() || nomService.isEmpty())
            avv.afficherErreur();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        Date dateArr = null;
        try {
            dateArr = sdf.parse(dayArr + " " + monthArr + " " + yearArr);
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
        switch(categorie)
        {
            case VOITURE:
                p.ajouterVehicule(new VehiculeIntervention(immatriculation, 15000, 8000, 3, dateArr, Categorie.VOITURE, nomService));
                break;
            case UTILITAIRE:
                p.ajouterVehicule(new VehiculeIntervention(immatriculation, 15000, 10000, 8, dateArr, Categorie.UTILITAIRE, nomService));
        }
        tb.updateListVehicule(p.getVehicules());
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
