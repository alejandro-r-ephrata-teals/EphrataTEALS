package studentWork.Unit8.Dice.DiceProject;


/** A player in the dice game has four dice to roll. */
public class DicePlayer {
    private String Player;
    private Die[] dice;

    public DicePlayer(String name) {

        this.Player = name;
        this.dice = new Die[4];
        for(int i = 0; i < this.dice.length; i++) {
            this.dice[i] = new Die();
        }

    }

   
    public String getName(){
        return this.Player;
    }

    public Die[] getDice(){
        return this.dice;
    }

    public void rollDice()  {

        for(int i = 0; i < this.dice.length; i++) {
            this.dice[i].roll();
        }

        }
        // TODO (3): Roll each die in the Die array.

    public void reroll(int diePosition) {
        this.dice[diePosition].roll();
        // TODO (4): Roll only the Die at index diePosition.
    }

    /********************************************/
    /* No modifications needed below this line. */
    /********************************************/

    /** Get the score for this player, which is the sum of all their dice rolls. */
    public int getScore() {
        int score = 0;
        for (int i  = 0; i < dice.length; i++) {
            score += dice[i].getCurrentNumber();
        }
        return score;
    }

    public String toString()  {
        String result = "";
        for (int i = 0; i < dice.length; i++) {
            result += "(" + (i + 1) + ")\n";
            result += dice[i].toString() + "\n";
        }
        return result;
    }
    
}
