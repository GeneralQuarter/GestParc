/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.Categorie;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Classe représentant un vehicule de service.
 * @author qgangler
 */
public class VehiculeService extends Vehicule{
    private boolean affecte; 
    private String nomResponsable; 
    private Date dateDebutAff; 
    private Date dateFinAff;

    /**
     * Constructeur de la classe
     * @param immatriculation l'immatriculation du vehicule
     * @param kilometrageMaxAnnuel le kilométrage maximum annuel du vehicule
     * @param kilometrageMaxApresRevision le kilométrage maximum du vehicule après sa révision
     * @param dureeVieMax la durée vie maxium du vehicule en années
     * @param dateArrVehicule la date d'arrivée du vehicule dans le parc
     * @param categorie la catégorie du vehicule
     * @param affecte valeur booleenne permettant de savoir si le vehicule est ou non affecté
     * @param nomResponsable nom du responsable affecté au vehicule
     * @param dateDebutAff date de début d'affectation du vehicule
     * @param dateFinAff date de fin d'affectation du vehicule
     */
    public VehiculeService(String immatriculation, int kilometrageMaxAnnuel, int kilometrageMaxApresRevision, int dureeVieMax, Date dateArrVehicule, Categorie categorie, boolean affecte, String nomResponsable, Date dateDebutAff, Date dateFinAff) {
        super(immatriculation, kilometrageMaxAnnuel, kilometrageMaxApresRevision, dureeVieMax, dateArrVehicule, categorie);
        this.affecte = affecte;
        this.nomResponsable = nomResponsable;
        this.dateDebutAff = dateDebutAff;
        this.dateFinAff = dateFinAff;
        
    }
    
    /**
     * Getter sur l'affectation du vehicule
     * @return la valeur affecte du vehicule
     */
    public boolean isAffecte() {
        return affecte;
    }

    /**
     * Getter sur le nom de responsable du vehicule
     * @return le nomResponsable du vehicule
     */
    public String getNomResponsable() {
        return nomResponsable;
    }

    /**
     * Getter sur la date de début d'affectation du vehicule
     * @return la dateDebutAff du vehicule
     */
    public Date getDateDebutAff() {
        return dateDebutAff;
    }

    /**
     * Getter sur la date de fin d'affectation du vehicule
     * @return la dateFinAff du vehicule
     */
    public Date getDateFinAff() {
        return dateFinAff;
    }
    
    @Override
    public String toString()
    {
        String res = super.toString();
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        if(!affecte)
        {
            res+= "\nAffecté : " + affecte;
        }else{
            res+= "\nAffecté : " + affecte +
                "\nNom responsable : " + nomResponsable +
                "\nDate début d'affectation : " + df.format(dateDebutAff) +
                "\nDate fin d'affectation : " + df.format(dateFinAff);
        }
        return res;        
    }
    
}
