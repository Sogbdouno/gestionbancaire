/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbancaire;

/**
 *
 * @author boubadiop
 * informations sur un compte epargne
 */
public class CompteEpargne extends Compte {
    private String tauxRenumeration;
    
    public CompteEpargne(){
        super();
    }
    
    public CompteEpargne(String numCompte,String nomCompte,String solde,
            String dateOuverture,String tauxRenumeration)
    {
        super(numCompte,nomCompte,solde,dateOuverture);
        this.tauxRenumeration = tauxRenumeration;
    }

    public String getTauxRenumeration() {
        return tauxRenumeration;
    }

    public void setTauxRenumeration(String tauxRenumeration) {
        this.tauxRenumeration = tauxRenumeration;
    }

    @Override
    public String toString() {
        return super.toString()  + "tauxRenumeration=" + tauxRenumeration ;
    }
    
    
    
}
