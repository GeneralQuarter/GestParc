/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.vue;

import gestparc.controleur.Controleur;
import gestparc.modele.CellRendererListeVehicule;
import gestparc.modele.ModeleListeVehicule;
import gestparc.modele.Vehicule;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author vpivet
 */
public class TableauBord extends javax.swing.JFrame {
    private Controleur ctrl;
    /**
     * Creates new form TableauBord
     */
    public TableauBord(Controleur ctrl) {
        this.ctrl = ctrl;
                try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TableauBord.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        jListVehicule.setModel(new DefaultComboBoxModel());
        jListIntervention.setModel(new DefaultComboBoxModel());
        this.setVisible(true);
    }
    
    public void updateListVehicule(List<Vehicule> vehicules)
    {
        jListVehicule.setModel(new ModeleListeVehicule(vehicules));
        jListVehicule.setCellRenderer(new CellRendererListeVehicule(vehicules));
        jListVehicule.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAjouterVehicule = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListVehicule = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDetailVehicule = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListIntervention = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jAjouterIntervention = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jAjouterVehicule.setText("Ajouter Vehicule");
        jAjouterVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjouterVehiculeActionPerformed(evt);
            }
        });

        jListVehicule.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Coucou", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListVehicule);

        jDetailVehicule.setColumns(20);
        jDetailVehicule.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jDetailVehicule.setLineWrap(true);
        jDetailVehicule.setRows(5);
        jScrollPane2.setViewportView(jDetailVehicule);

        jListIntervention.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListIntervention);

        jLabel1.setText("Interventions");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Vehicules du parc");

        jAjouterIntervention.setText("Ajouter Intervention");
        jAjouterIntervention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjouterInterventionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 540, Short.MAX_VALUE)
                        .addComponent(jAjouterIntervention)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAjouterVehicule))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAjouterVehicule)
                    .addComponent(jAjouterIntervention))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAjouterVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjouterVehiculeActionPerformed
        ctrl.afficherAjouterVehicule();
    }//GEN-LAST:event_jAjouterVehiculeActionPerformed

    private void jAjouterInterventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjouterInterventionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAjouterInterventionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAjouterIntervention;
    private javax.swing.JButton jAjouterVehicule;
    private javax.swing.JTextArea jDetailVehicule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jListIntervention;
    private javax.swing.JList jListVehicule;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
