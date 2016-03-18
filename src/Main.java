/**
 * Created by kersuzan on 17/03/16.
 */
public class Main {

    public static void main(String[] args) {
        BasketBallPlayer tonyParker = new BasketBallPlayer("Tony Parker");
        FootballPlayer messi = new FootballPlayer("Lionel Messi");
        TennisPlayer nadal = new TennisPlayer("Raphael Nadal");

        Team myTeam = new Team("My own team");
        myTeam.addPlayer(tonyParker);
        myTeam.addPlayer(messi);
        myTeam.addPlayer(nadal);

        System.out.println(myTeam.numberOfPlayers());
    }

}
