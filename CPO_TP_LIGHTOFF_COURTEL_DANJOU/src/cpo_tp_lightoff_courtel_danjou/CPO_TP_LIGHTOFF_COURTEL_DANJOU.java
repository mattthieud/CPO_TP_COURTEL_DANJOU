/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpo_tp_lightoff_courtel_danjou;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class CPO_TP_LIGHTOFF_COURTEL_DANJOU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Joueur J = new Joueur("jul");
        Partie game = new Partie(J);
        
        game.placerCelluleLumineuse();
        game.LancerPartie();
        
        while(true) {
            
        System.out.print("\n");
        System.out.println("Quel est ton x ?");
        int x = sc.nextInt();
        System.out.println("Quel est ton x y");
        int y = sc.nextInt();
        
        try {
             game.action(x, y);
        } catch (ArrayIndexOutOfBoundsException erreur) {
            System.out.println("erreur, essaye encore!");
        }
       
        game.LancerPartie();
        }
    }
}

