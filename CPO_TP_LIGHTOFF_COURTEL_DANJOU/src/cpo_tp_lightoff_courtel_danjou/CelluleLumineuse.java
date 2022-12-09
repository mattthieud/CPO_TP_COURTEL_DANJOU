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
    
    public boolean EtatCelluleLumineuse(){ /*Cette méthode permet de savoir si la 
CelluleLumineuse est allumée ou non */
        if (allumée == true){
            return true ;
        } else {
            return false;
        }   
    }
    
    public boolean ChangeEtat (){
        if (allumée== true ){
            return false;
        } else if (allumée == false) {
            return true;
        }
    return false;    
    }

@Override//ecrase
public String toString (){/*Création de la méthode toString 
pour retourner dans la console */
        if (this.EtatCelluleLumineuse()==false){
            return "o";
        }
        if(this.EtatCelluleLumineuse()==true){
            return"@";
        }
    return "k";
    }    
} 
