package net.douaa.dao;

import org.springframework.stereotype.Repository;

@Repository("d")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double t = 34;
        return t;
    }
}
