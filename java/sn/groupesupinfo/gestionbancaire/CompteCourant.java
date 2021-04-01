/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbancaire;

/**
 *
 * @author boubadiop
 * enregister les informatons sur un compte courant
 */
public class CompteCourant extends Compte {
    private String decouvertAutorise;
    private String fraisDecouvert;
    
    public CompteCourant(){
        super();
    }
    
    public CompteCourant(String numCompte,String nomCompte,String solde,
            String dateOuverture,String decouvertAutorise,String fraisDecouvert)
    {
        super(numCompte,nomCompte,solde,dateOuverture);
        this.decouvertAutorise = decouvertAutorise;
        this.fraisDecouvert = fraisDecouvert;
    }

    public String getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(String decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public String getFraisDecouvert() {
        return fraisDecouvert;
    }

    public void setFraisDecouvert(String fraisDecouvert) {
        this.fraisDecouvert = fraisDecouvert;
    }

    @Override
    public String toString() {
        return super.toString() + "decouvertAutorise=" + decouvertAutorise + ","
                + " fraisDecouvert=" + fraisDecouvert;
    }
    
}
