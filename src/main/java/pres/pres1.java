package pres;

import dao.DoaImpl;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        /*couplage fort
        * a chaque fois ou on a a une modification on doit modifier le code source.. --> alors on doit rendre cette couche presentation fermee a la modification
        * on va pas utiliser new (l'instanciation statique )
        * l'ideal c est d'utiliser (l'instanciation dynamique) pour faciliter la maintenance*/
        /* DoaImpl dao = new DoaImpl(); --> permet de creer un objet dao de type classe DaoImpl*/
        DoaImpl dao = new DoaImpl();
        /*DoaImpl2 dao = new DoaImpl2();*/
        /* MetierImpl metier= new MetierImpl();-->permet de creer un objet metier de type classe MetierImpl*/
        MetierImpl metier = new MetierImpl();
        /* on doit assosier les objets : acceder  a l'objet metier */
        /* l'objet metier est en relation avec l'objet dao= l'objet metier possede l'adresse memoire le l'objet dao */
        /*injection des dependances = prendre l'adreese memoire d un objet et l'affecter a un autre objet relation unidirectionnelle */
        metier.setDao(dao); /*injection des dependances*/
        System.out.println("RES="+metier.calcul());
        
    }
}
