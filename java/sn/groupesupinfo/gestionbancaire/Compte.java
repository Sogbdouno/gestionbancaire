/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbancaire;

/**
 *
 * @author boubadiop
 * enregister les informations sur un compte bancaire
 */
public class Compte {
    private String numCompte;
    private String nomCompte;
    private String solde;
    private String dateOuverture;
    
    public Compte(){
        
    }
    
    public Compte(String numCompte,String nomCompte,String solde,String dateOuverture)
    {
        this.numCompte = numCompte;
        this.nomCompte = nomCompte;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getNomCompte() {
        return nomCompte;
    }

    public void setNomCompte(String nomCompte) {
        this.nomCompte = nomCompte;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    @Override
    public String toString() {
        return  "numCompte=" + numCompte + ", nomCompte=" + nomCompte
                + ", solde=" + solde + ", dateOuverture=" + dateOuverture;
    }
    
    
}

