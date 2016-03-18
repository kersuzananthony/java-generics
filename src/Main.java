/**
 * Created by kersuzan on 17/03/16.
 */
public class Main {

    public static void main(String[] args) {
        // Create players
        BasketBallPlayer tonyParker = new BasketBallPlayer("Tony Parker");
        TennisPlayer nadal = new TennisPlayer("Raphael Nadal");

        FootballPlayer messi = new FootballPlayer("Lionel Messi");
        FootballPlayer footballPlayer2 = new FootballPlayer("Football player 2");
        FootballPlayer footballPlayer3 = new FootballPlayer("Football player 3");

        // Create teams
        Team<FootballPlayer> myFootballTeam = new Team<>("My football team");
        Team<FootballPlayer> secondFootballTeam = new Team<>("Another football team");
        Team<FootballPlayer> thirdFootballTeam = new Team<>("A third football team");
        Team<TennisPlayer> myTennisTeam = new Team<>("My tennis team");
        Team<BasketBallPlayer> myBasketBallTeam = new Team<>("My basket ball team");

        // Add players to teams
        myBasketBallTeam.addPlayer(tonyParker);
        myTennisTeam.addPlayer(nadal);
        myFootballTeam.addPlayer(messi);
        myFootballTeam.addPlayer(footballPlayer2);
        myFootballTeam.addPlayer(footballPlayer3);

        System.out.println(myFootballTeam.numberOfPlayers());

        // Results
        myFootballTeam.matchResult(secondFootballTeam, 4, 3);
        myFootballTeam.matchResult(thirdFootballTeam, 1, 1);
        myFootballTeam.matchResult(secondFootballTeam, 1, 2);

        System.out.println("Ranking : " + myFootballTeam.ranking());
    }

}
