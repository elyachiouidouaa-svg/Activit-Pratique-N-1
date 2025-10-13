package pres;

import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao = new DaoImpl ();
        //Comment creer l'objet dao (l'instanciation dynamique)
        //1-lire le ficher txt
        Scanner scanner;
        try {
            scanner = new Scanner(new File("config.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String daoClassName = scanner.nextLine();
        System.out.println("daoClassName = " + daoClassName);
        //System.out.println(daoClassName);
        //2-charger la classe en memoire instancier
        //methode (Forname): chercher si la classe existe reelement
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance(); // new constructeur -> DaoImpl
        System.out.println(dao.getData());
        //metier.setDao(dao); --> Injection des depandances ..
        //Method setDao=cMetier.getDeclaredMethod("setDao", IDao.class);
        //setDao.invoke(metier,dao); //j'execute la methode setdao sur l'objet metier et je lui transforme comme parametre l'objet dao

    }
}
