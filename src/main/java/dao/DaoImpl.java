package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {
    @Override
    public double getDate() {
        System.out.println("Version base de données");
        double temp = 25;
        return temp;
    }
}
