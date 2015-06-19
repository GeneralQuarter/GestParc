/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import java.awt.Component;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Classe de modification de la couleur des cellules dans la liste de vehicule
 * @author qgangler
 */
public class CellRendererListeVehicule extends JLabel implements ListCellRenderer<Vehicule>{
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Vehicule> list, Vehicule value, int index, boolean isSelected, boolean cellHasFocus) {
        String s = value.getDescription();
        setText(s);
        if (isSelected) {
            setBackground(value.getCouleur().getColor().darker());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(value.getCouleur().getColor());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
    }
    
}
