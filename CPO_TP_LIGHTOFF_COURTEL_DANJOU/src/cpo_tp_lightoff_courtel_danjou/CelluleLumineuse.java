/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_tp_lightoff_courtel_danjou;

/**
 *
 * @author Utilisateur
 */
public class CelluleLumineuse {
    
boolean allumée ;
    
    public boolean EtatCelluleLumineuse() { /*Cette méthode permet de savoir si la 
cellule lumineuse est allumée (renvoie true) ou éteinte(renvoie false) et renvoie 
également false si toutes les cellules lumineuses sont éteintes*/
        if (allumée == true){
            return true ;
        } else if (allumée == false){
            return false;
        } 
        return false;
    }
    
    public boolean ChangeEtat() { /*Cette méthode permet de changer l'état d'une 
cellule lumineuse allumée en éteinte ou inversement éteinte en allumée et renvoie 
l'état de la cellule lumineuse*/
        if (allumée== true ){
            allumée = false;
        } else if (allumée == false){
            allumée = true;
        }
    return allumée;    
}

@Override//ecrase
public String toString(){/*Création de la méthode toString 
pour retourner dans la console */
        if (this.EtatCelluleLumineuse()==false){
            return "o";
        }
        if(this.EtatCelluleLumineuse()==true){
            return"#";
        }
    return "k";
    }    
} 
