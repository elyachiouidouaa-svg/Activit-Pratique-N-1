package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;
    @Override
    public double calcul() {
        /* utiliser objet dao pour recuperer data */
        double d= dao.getData();
        double RES=d*11.4;
        return RES;
    }
    /* acceder a l'objet metier
    setters nous aide a injecter dans la variable dao : un objet d'une classe qui implemente l'interface Idao*/

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
