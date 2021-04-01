/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbancaire;

/**
 *
 * @author boubadiop
 * enregister les informations sur un proprietaire
 */
public class Proprietaire extends Compte {
    private String nom;
    private String prenom;
    private String age;
    private String adresse;
    private String dateNaissance;
    
    public Proprietaire(){
        super();
    }
    
    public Proprietaire(String numCompte,String nomCompte,String solde,
            String dateOuverture,String tauxRenumeration,String nom,String prenom,
            String age, String adresse,String dateNaissance)
    {
        super(numCompte,nomCompte,solde,dateOuverture);
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return super.toString() + "nom=" + nom + ", prenom=" + prenom + ", age="
                + age + ", adresse=" + adresse + ", dateNaissance="
                + dateNaissance;
    }
    
    

    
}
