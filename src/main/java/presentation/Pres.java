package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        // via setter
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // via constructor
        //MetierImpl metier2 = new MetierImpl(dao);
        System.out.println("Res="+ metier.calcul());
    }
}
