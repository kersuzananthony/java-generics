import java.util.ArrayList;

/**
 * Created by kersuzan on 18/03/16.
 */

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already ont this team!");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " has been added to the team " + this.name);
            return true;
        }
    }

    public int numberOfPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
            System.out.println(this.name + " won the match!");
        } else if (ourScore < theirScore) {
            lost++;
            System.out.println(this.name + " lost the match!");
        } else {
            tied++;
            System.out.println(this.name + " neither won nor lost");
        }
        played++;

        if (opponent != null) {
            // Update opponent team statistics
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
