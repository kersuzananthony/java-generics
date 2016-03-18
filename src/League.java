import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kersuzan on 18/03/16.
 */
public class League<T extends Team> {

    public String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in the " + this.name + " league.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " has joined the " + this.name + " league.");
            return true;
        }
    }

    public void getLeagueClassment() {
        Collections.sort(teams);
        System.out.println("----------Classment----------");
        for (T t: teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
