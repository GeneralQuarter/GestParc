/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc;

import gestparc.controleur.Controleur;
import gestparc.vue.TableauBord;
import javax.swing.SwingUtilities;

/**
 *
 * @author qgangler
 */
public class GestParc {

    /**
     * Fonction principale du programme
     * Instantiation du controleur et de la vue
     * @param args 
     * 
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                Controleur ctrl = new Controleur();
                TableauBord tb = new TableauBord(ctrl);
            }
            
        });
    }
    
}
