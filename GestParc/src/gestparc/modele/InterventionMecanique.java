/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.PieceMecanique;
import gestparc.modele.enums.TypeMecanique;
import java.util.Calendar;
import java.util.Date;

/**
 * Classe qui représente une intervention mécanique sur un vehicule
 * @author qgangler
 */
public class InterventionMecanique implements Intervention{
    private TypeMecanique typeIntervention;
    private PieceMecanique piece;
    private final Date dateIntervention;
    
    /**
     * Getter du type d'intervention mécanique
     * @return type d'intervention mécanique
     */
    public TypeMecanique getTypeIntervention() {
        return typeIntervention;
    }
    
    /**
     * Getter de la piece concernée pour l'intervention
     * @return piece concernée pour l'intervention
     */
    public PieceMecanique getPiece() {
        return piece;
    }
    
    /**
     * Constructeur de la classe
     * @param typeIntervention le type d'intervention mécanique
     * @param piece la piece concernée pour l'intervention
     */
    public InterventionMecanique(TypeMecanique typeIntervention, PieceMecanique piece) {
        this.typeIntervention = typeIntervention;
        this.piece = piece;
        this.dateIntervention = Calendar.getInstance().getTime();
    }

    public Date getDateIntervention() {
        return dateIntervention;
    }
    
    @Override
    public String toString()
    {
        return typeIntervention + " sur " + piece + " le " + dateIntervention.toString();
    }
}
