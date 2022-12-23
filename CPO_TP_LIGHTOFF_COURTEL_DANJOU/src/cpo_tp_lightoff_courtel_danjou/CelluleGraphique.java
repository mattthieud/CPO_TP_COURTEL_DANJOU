/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_tp_lightoff_courtel_danjou;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author jules
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleAssociee;
    ImageIcon img_eteinte = new javax.swing.ImageIcon(getClass().getResource("/images/blue.png"));
    ImageIcon img_allumee = new javax.swing.ImageIcon(getClass().getResource("/images/jaune.png"));
    
    public CelluleGraphique (CelluleLumineuse uneCellule) {
        celluleAssociee = uneCellule;
    }
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        if (celluleAssociee.EtatCelluleLumineuse() == false) {
            setIcon(img_eteinte);
        }
        else if (celluleAssociee.EtatCelluleLumineuse() == true) {
            setIcon(img_allumee);    
        }
    } 
}
  