/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import gestparc.enumPack.PieceCarrosserie;
import gestparc.enumPack.TypeCarrosserie;

/**
 *
 * @author qgangler
 */
public class InterventionCarrosserie implements Intervention {
    private TypeCarrosserie typeIntervention;
    private PieceCarrosserie piece;

    public InterventionCarrosserie(TypeCarrosserie typeIntervention, PieceCarrosserie piece) {
        this.typeIntervention = typeIntervention;
        this.piece = piece;
    }

    public TypeCarrosserie getTypeIntervention() {
        return typeIntervention;
    }

    public PieceCarrosserie getPiece() {
        return piece;
    }
    
}
