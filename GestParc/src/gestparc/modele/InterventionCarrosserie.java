/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import gestparc.modele.enums.PieceCarrosserie;
import gestparc.modele.enums.TypeCarrosserie;
import gestparc.modele.enums.PieceCarrosserie;
import gestparc.modele.enums.TypeCarrosserie;
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
