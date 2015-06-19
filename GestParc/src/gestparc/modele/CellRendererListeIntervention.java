/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.modele;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author qgangler
 */
public class CellRendererListeIntervention extends JLabel implements ListCellRenderer<Intervention>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Intervention> list, Intervention value, int index, boolean isSelected, boolean cellHasFocus) {
        String s = value.toString();
        setText(s);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
    }
    
}
