import Impl.UserConfiguration;
import Impl.users.MauricioHernandez;
import Impl.users.LuisaSepulveda;
import Impl.users.RaulFandino;
import Impl.users.JuanCastro;

import Impl.users.SebastianPuerto;

import java.util.Map;

/**
 * Created by lsepulveda on 1/11/2018.
 */
public class FirstMain {

    private static UserConfiguration userConfiguration = new UserConfiguration();

    public static void main(String[] args) {

        Map<String, String> usersReturned = userConfiguration.createUser();
        System.out .println("ID" + "\t\t\t\t\t" + "Name");
        System.out.println("---------------------------------------------------");

        LuisaSepulveda luisaSepulveda = new LuisaSepulveda();
        System.out.println(luisaSepulveda.getId() + "\t\t\t" + luisaSepulveda.getFullName());

        RaulFandino raulFandino = new RaulFandino();
        System.out.println(raulFandino.getId() + "\t\t\t" + raulFandino.getFullName());

//        JavierTronconis javierTronconis = new JavierTronconis();
//        System.out.println(javierTronconis.getId() + "\t\t\t" + javierTronconis.getFullName());
//
//        AlejandraChacon alejandraChacon = new AlejandraChacon();
//        System.out.println(alejandraChacon.getId() + "\t\t\t" + alejandraChacon.getFullName());
//
//        LuisZarate luisZarate = new LuisZarate();
//        System.out.println(luisZarate.getId() + "\t\t\t" + luisZarate.getFullName());
//

//
        SebastianPuerto joanPuerto = new SebastianPuerto();
        System.out.println(joanPuerto.getId() + "\t\t\t" + joanPuerto.getFullName());
//
//        DavidBeltran davidBeltran = new DavidBeltran();
//        System.out.println(davidBeltran.getId() + "\t\t\t" + davidBeltran.getFullName());
//
        MauricioHernandez andresHernandez = new MauricioHernandez();
        System.out.println(andresHernandez.getId() + "\t\t\t" + andresHernandez.getFullName());
//
//        EstefaniaCalderon estefaniaCalderon = new EstefaniaCalderon();
//        System.out.println(estefaniaCalderon.getId() + "\t\t\t" + estefaniaCalderon.getFullName());
//
//        AndresGomez andresGomez = new AndresGomez();
//        System.out.println(andresGomez.getId() + "\t\t\t" + andresGomez.getFullName());
//
//        MiguelBallen miguelBallen = new MiguelBallen();
//        System.out.println(miguelBallen.getId() + "\t\t\t" + miguelBallen.getFullName());
//
//        SergioForero sergioForero = new SergioForero();
//        System.out.println(sergioForero.getId() + "\t\t\t" + sergioForero.getFullName());
//
//        EduardoGaleano eduardoGaleano = new EduardoGaleano();
//        System.out.println(eduardoGaleano.getId() + "\t\t\t" + eduardoGaleano.getFullName());
//
//        VanessaArteaga vanessaArteaga = new VanessaArteaga();
//        System.out.println(vanessaArteaga.getId() + "\t\t\t" + vanessaArteaga.getFullName());
//
//        RicardoGonzalez ricardoGonzalez = new RicardoGonzalez();
//        System.out.println(ricardoGonzalez.getId() + "\t\t\t" + ricardoGonzalez.getFullName());
//
//        JhonatanGuzman jhonatanGuzman = new JhonatanGuzman();
//        System.out.println(jhonatanGuzman.getId() + "\t\t\t" + jhonatanGuzman.getFullName());
    }
}
