/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbancaire;

/**
 *
 * @author boubadiop
 * afficher les nformations sur differents comptes
 */
public class TestCompte {
    public static void main(String[]args){
        Compte compte = new Compte();
        compte.setNumCompte("AD123456");
        compte.setNomCompte("compte Bancaire");
        compte.setSolde("$456");
        compte.setDateOuverture("12/09/2020");
        
        CompteCourant comptecourant = new CompteCourant("4DG76789","compte courant",
                                          "$647347","12/08/2020","$234","$450");
        
        CompteEpargne compteepargne = new CompteEpargne("4DG76789","compte Epargne",
                                          "$647347","12/08/2020","25%");
        
        System.out.println(compte);
        System.out.println("=============================");
        System.out.println(comptecourant);
        System.out.println("=============================");
        System.out.println(compteepargne);
    }
}
