package metier;

public class MetierImpl implements metier {
    private Idao dao;
    @Override
    public double calcul(){
            double data=dao.getData();
            double res=data*23;
            return res;
}


}
