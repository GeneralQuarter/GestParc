/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.PieceCarrosserie;
import gestparc.modele.enums.TypeCarrosserie;
import java.util.Calendar;
import java.util.Date;

/**
 * Objet qui représente une intervention sur la carrosserie d'un vehicule
 * @author qgangler
 */
public class InterventionCarrosserie implements Intervention {
    private TypeCarrosserie typeIntervention;
    private PieceCarrosserie piece;
    private final Date dateIntervention;
    
    /**
     * Constructeur de la classe
     * @param typeIntervention le type d'intervention
     * @param piece la piece concernée
     * @see TypeCarrosserie
     * @see PieceCarrosserie
     */
    public InterventionCarrosserie(TypeCarrosserie typeIntervention, PieceCarrosserie piece) {
        this.typeIntervention = typeIntervention;
        this.piece = piece;
        dateIntervention = Calendar.getInstance().getTime();
    }

    public Date getDateIntervention() {
        return dateIntervention;
    }
    
    /**
     * Getter du type de carrosserie
     * @return type de carrosserie de l'intervention
     */
    public TypeCarrosserie getTypeIntervention() {
        return typeIntervention;
    }
    
    /**
     * Getter de la piece concernée
     * @return piece concernée pour l'intervention
     */
    public PieceCarrosserie getPiece() {
        return piece;
    }
    
    @Override
    public String toString()
    {
        return typeIntervention + " sur " + piece + " le " + dateIntervention.toString();
    }
    
}
