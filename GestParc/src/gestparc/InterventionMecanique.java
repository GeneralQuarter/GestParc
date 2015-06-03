/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import gestparc.enumPack.PieceMecanique;
import gestparc.enumPack.TypeMecanique;
import java.util.Calendar;

/**
 *
 * @author qgangler
 */
public class InterventionMecanique implements Intervention{
    private TypeMecanique typeIntervention;
    private PieceMecanique piece;
    private final Calendar dateIntervention;

    public TypeMecanique getTypeIntervention() {
        return typeIntervention;
    }

    public PieceMecanique getPiece() {
        return piece;
    }

    public InterventionMecanique(TypeMecanique typeIntervention, PieceMecanique piece) {
        this.typeIntervention = typeIntervention;
        this.piece = piece;
        this.dateIntervention = Calendar.getInstance();
    }
}
