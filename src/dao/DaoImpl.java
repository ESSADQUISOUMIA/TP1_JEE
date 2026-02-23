package dao;

public class DaoImpl implements Idao {
    @Override
    public double getData() {
        System.out.println("version 1 de la methode getData");
        double temp=25;
        return temp;

    }
}
