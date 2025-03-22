package ext;

import dao.IDao;

public class DaoIpmlV2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("Version web service");
        double t = 77;
        return t;
    }
}
