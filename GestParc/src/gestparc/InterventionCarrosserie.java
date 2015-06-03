/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import gestparc.enumPack.PieceCarrosserie;
import gestparc.enumPack.TypeCarrosserie;
import java.util.Calendar;

/**
 *
 * @author qgangler
 */
public class InterventionCarrosserie implements Intervention {
    private TypeCarrosserie typeIntervention;
    private PieceCarrosserie piece;
    private final Calendar dateIntervention;

    public InterventionCarrosserie(TypeCarrosserie typeIntervention, PieceCarrosserie piece) {
        this.typeIntervention = typeIntervention;
        this.piece = piece;
        dateIntervention = Calendar.getInstance();
    }

    public TypeCarrosserie getTypeIntervention() {
        return typeIntervention;
    }

    public PieceCarrosserie getPiece() {
        return piece;
    }
    
}
