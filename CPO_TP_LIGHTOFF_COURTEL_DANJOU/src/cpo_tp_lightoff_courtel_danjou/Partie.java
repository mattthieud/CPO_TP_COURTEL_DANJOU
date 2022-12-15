package cpo_tp_lightoff_courtel_danjou;

import java.util.Random;

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
        grille_jeu.ChangeEtat(x+1, y);         
        grille_jeu.ChangeEtat(x-1, y);         
        grille_jeu.ChangeEtat(x, y+1);         
        grille_jeu.ChangeEtat(x, y-1);
    }
    
    public void LancerPartie() {
        grille_jeu.afficherGrilleSurConsole();
    }
}
    
    

