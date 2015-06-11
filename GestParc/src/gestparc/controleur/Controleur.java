/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.controleur;

import gestparc.modele.Parc;
import gestparc.modele.Vehicule;
import gestparc.modele.VehiculeIntervention;
import gestparc.modele.VehiculeService;
import gestparc.modele.VehiculeTransportEmploye;
import gestparc.modele.VehiculeTransportPassage;
import gestparc.modele.enums.Categorie;
import gestparc.vue.AjoutVehiculeVue;
import gestparc.vue.TableauBord;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
                p.ajouterVehicule(new VehiculeIntervention(immatriculation, 20000, 10000, 8, dateArr, Categorie.VOITURE, nomService));
                break;
            case UTILITAIRE:
                p.ajouterVehicule(new VehiculeIntervention(immatriculation, 20000, 10000, 8, dateArr, Categorie.UTILITAIRE, nomService));
        }
        tb.updateListVehicule(p.getVehicules());
    }
    
    public void ajouterVehiculeService(String immatriculation, Categorie categorie, 
            String dayArr, String monthArr, String yearArr, 
            String dayDebAff, String monthDebAff, String yearDebAff, 
            String dayFinAff, String monthFinAff, String yearFinAff, 
            String nomResponsable)
    {
        if(immatriculation.isEmpty() || nomResponsable.isEmpty())
            avv.afficherErreur();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        Date dateArr = null;
        Date dateDebAff = null;
        Date dateFinAff = null;
        try {
            dateArr = sdf.parse(dayArr + " " + monthArr + " " + yearArr);
            dateDebAff = sdf.parse(dayDebAff + " " + monthDebAff + " " + yearDebAff);
            dateFinAff = sdf.parse(dayFinAff + " " + monthFinAff + " " + yearFinAff);
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
        
        if(dateArr.after(dateDebAff))
            avv.afficherErreur();
        if(dateDebAff.after(dateFinAff))
            avv.afficherErreur();
        
        switch(categorie)
        {
            case VOITURE:
                p.ajouterVehicule(new VehiculeService(immatriculation, 15000, 15000, 8, dateArr, Categorie.VOITURE, true, nomResponsable, dateDebAff, dateFinAff));
                break;
            case UTILITAIRE:
                p.ajouterVehicule(new VehiculeService(immatriculation, 15000, 15000, 8, dateArr, Categorie.UTILITAIRE, true, nomResponsable, dateDebAff, dateFinAff));
        }
        tb.updateListVehicule(p.getVehicules());
    }
    
    public void ajouterVehiculeService(String immatriculation, Categorie categorie, 
            String dayArr, String monthArr, String yearArr)
    {
        if(immatriculation.isEmpty())
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
                p.ajouterVehicule(new VehiculeService(immatriculation, 15000, 15000, 8, dateArr, Categorie.VOITURE, false, "", null, null));
                break;
            case UTILITAIRE:
                p.ajouterVehicule(new VehiculeService(immatriculation, 15000, 15000, 8, dateArr, Categorie.UTILITAIRE, false, "", null, null));
        }
        tb.updateListVehicule(p.getVehicules());
    }
    
    public void ajouterVehiculeTransportEmploye(String immatriculation, Categorie categorie, String dayArr, String monthArr, String yearArr, String nomSite)
    {
        if(immatriculation.isEmpty() || nomSite.isEmpty())
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
                p.ajouterVehicule(new VehiculeTransportEmploye(immatriculation, 20000, 5000, 3, dateArr, Categorie.VOITURE, nomSite));
                break;
            case CAMIONNETTE:
                p.ajouterVehicule(new VehiculeTransportEmploye(immatriculation, 40000, 5000, 5, dateArr, Categorie.CAMIONNETTE, nomSite));
                break;
            case BUS:
                p.ajouterVehicule(new VehiculeTransportEmploye(immatriculation, 60000, 3000, 10, dateArr, Categorie.BUS, nomSite));
        }
        tb.updateListVehicule(p.getVehicules());
    }
    
    public void ajouterVehiculeTransportPassager(String immatriculation, Categorie categorie, String dayArr, String monthArr, String yearArr, String nomDepot)
    {
        if(immatriculation.isEmpty() || nomDepot.isEmpty())
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
            case CAMIONNETTE:
                p.ajouterVehicule(new VehiculeTransportPassage(immatriculation, 40000, 5000, 5, dateArr, Categorie.CAMIONNETTE, nomDepot));
                break;
            case BUS:
                p.ajouterVehicule(new VehiculeTransportPassage(immatriculation, 60000, 3000, 10, dateArr, Categorie.BUS, nomDepot));
        }
        tb.updateListVehicule(p.getVehicules());
    }
    
    public void ajouterIntervention()
    {
        
    }
    
    public List<Vehicule> getVehicules()
    {
        return p.getVehicules();
    }
    
    public void ajouterMilleKm(int indexVehicule)
    {
        p.ajouterMilleKmAnnuel(indexVehicule);
        tb.updateListVehicule(p.getVehicules());
    }
}
