package soccer_08_Methods_Practice2.utility;

import soccer_08_Methods_Practice2.Game;
import soccer_08_Methods_Practice2.Goal;
import soccer_08_Methods_Practice2.Player;
import soccer_08_Methods_Practice2.Team;

public class GameUtils
{
public static void addGameGoals(Game currGame)
{
    for(int i=0;i<currGame.goals.length;i++)
    {
        Goal currGoal = currGame.goals[i];
        currGoal = new Goal();
        Team[] team = {currGame.homeTeam, currGame.awayTeam};
        int j = (int) (Math.random() * 2);
        if (j == 0)
        {
            currGoal.thePlayer = currGame.homeTeam.playerArray[(int) (Math.random() * 3)];
            currGoal.theTeam =currGame.homeTeam;
        }
        if (j == 1)
        {
            currGoal.thePlayer = currGame.awayTeam.playerArray[(int) (Math.random() * 3)];
            currGoal.theTeam = currGame.awayTeam;
        }
        currGoal.theTime=(int)(Math.random()*50);
        currGame.goals[i]=currGoal;
    }
}
}
