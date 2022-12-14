package cpo_tp_lightoff_courtel_danjou;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Utilisateur
 */
public class Partie {
    Joueur JoueurP;
    Grille plateau;
    Grille grille_jeu = new Grille();
    
    public Partie(Joueur J) {
        JoueurP = J;
        this.plateau = new Grille();
    }
    
    public void LancerPartie() {
        grille_jeu.afficherGrilleSurConsole();
    }
}
    
    

