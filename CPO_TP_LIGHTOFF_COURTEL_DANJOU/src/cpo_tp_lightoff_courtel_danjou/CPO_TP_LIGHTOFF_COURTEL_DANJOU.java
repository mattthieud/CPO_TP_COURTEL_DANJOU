/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpo_tp_lightoff_courtel_danjou;

/**
 *
 * @author Utilisateur
 */
public class CPO_TP_LIGHTOFF_COURTEL_DANJOU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Joueur J = new Joueur("jul");
        Partie game = new Partie(J);
         
        game.grille_jeu.afficherGrilleSurConsole();
        game.LancerPartie();
         
    }
    
}
