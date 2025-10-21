import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        TournamentManager tournamentManager = new TournamentManager();

         Team t1 = new Team("Lupi Verdi", "Scuola Alfa", "Basketball", 10.0);
         Team t2 = new Team("Lupi Verdi", "Scuola Alfa", "Soccer", 15.0);
         Team t3 = new Team("Aquile Rosse", "Scuola Beta", "Tennis", 20.0);
         Team t4 = new Team("Tigri Blu", "Scuola Gamma", "Volleyball", 25.0);
         Team t5 = new Team("Orsi Neri", "Scuola Delta", "Baseball", 30.0);



         tournamentManager.addTeam(t1);
         tournamentManager.addTeam(t2);
            tournamentManager.addTeam(t3);
            tournamentManager.addTeam(t4);
            tournamentManager.addTeam(t5);

        tournamentManager.printTeamsSortedByNatural();
        tournamentManager.printTeamsSortedBySport();
        tournamentManager.printTeamsSortedBySchool();










    }
}