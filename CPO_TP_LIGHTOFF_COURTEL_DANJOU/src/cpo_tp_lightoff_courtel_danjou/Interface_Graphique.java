/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cpo_tp_lightoff_courtel_danjou;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jules
 */
public class Interface_Graphique extends javax.swing.JFrame {
    Joueur JoueurP;
    Grille plateau;
    Grille grille_jeu = new Grille();
    /**
     * Creates new form Interface_Graphique
     */
    public Interface_Graphique() {
        initComponents();

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                final int x = i;
                final int y = j; 
                
                this.pack();
                CelluleGraphique cellGraph = new CelluleGraphique(grille_jeu.PlateauDeJeu[i][j]);
                panneau_grille.add(cellGraph);
                cellGraph.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    action(x, y);
                    panneau_grille.repaint();
                    }
                }); 
            }
        }
    } 
    
    public void placerCelluleLumineuse() { 
        for (int i = 0; i<5; i++){ //ligne 
           for (int j = 0; j<5; j++){ //colonne
                if (Math.random()>0.5){ 
                    grille_jeu.ChangeEtat(i, j);
                }
            }
        }    
    } 

    public void action(int x, int y) {
        grille_jeu.ChangeEtat(x, y);
        if (x < 5 - 1) {
            grille_jeu.ChangeEtat(x+1, y);
        }
        if (x > 0) {
            grille_jeu.ChangeEtat(x-1, y);
        }
        if (y < 5 - 1) {
            grille_jeu.ChangeEtat(x, y+1);
        }         
        if (y > 0) {
            grille_jeu.ChangeEtat(x, y-1);
        }
    }  
      
    public void initialiserPartie() {
        this.placerCelluleLumineuse(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        btn_start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(790, 700));
        setPreferredSize(new java.awt.Dimension(676, 737));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(0, 102, 204));
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 672, 672));

        btn_start.setBackground(new java.awt.Color(153, 153, 153));
        btn_start.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        btn_start.setForeground(new java.awt.Color(255, 255, 255));
        btn_start.setText("Lancer Partie");
        btn_start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_start.setIconTextGap(5);
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        getContentPane().add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 1, 100, 674));

        setBounds(0, 0, 788, 683);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_grille.repaint();
        initialiserPartie();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Graphique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JPanel panneau_grille;
    // End of variables declaration//GEN-END:variables
}
