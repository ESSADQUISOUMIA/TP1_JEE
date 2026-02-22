
import metier.Compte;
public class Main {
    public static void main(String[] args) {
        Compte c1= new Compte(300);
        c1.verser((float) 10.90F);
        System.out.println(c1.toString());
        }
    }
