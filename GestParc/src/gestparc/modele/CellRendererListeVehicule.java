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
 * Class de modification de la couleur des cellules dans la liste de vehicule
 * @author qgangler
 */
public class CellRendererListeVehicule extends JLabel implements ListCellRenderer<Object>{
    private List<Vehicule> vehicules;
    
    public CellRendererListeVehicule(List<Vehicule> vehicules)
    {
        this.vehicules = vehicules;
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String s = value.toString();
        setText(s);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(vehicules.get(index).getCouleur().getColor());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
    }
    
}
