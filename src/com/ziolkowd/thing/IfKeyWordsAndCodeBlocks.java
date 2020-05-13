package com.ziolkowd.thing;

public class IfKeyWordsAndCodeBlocks {
    public static void main(String[] args) {
        //Always remember if you dont space out your code and constantly duplicate code then you will need to go back and change lots of shit later if i change something significant!
        int finalResult = calculateScore(true, 1000, 3, 750);
        int finalResult2 = calculateScore(true, 500, 5, 500);

        System.out.println("Your final score was: " + finalResult);
        System.out.println("Your final score was: " + finalResult2);

        int num1 = calculateHighScorePosition(1500);
        int num2 = calculateHighScorePosition(900);
        int num3 = calculateHighScorePosition(400);
        int num4 = calculateHighScorePosition(50);
        int num5 = calculateHighScorePosition(25);
        int num6 = calculateHighScorePosition(5000);

        displayHighScorePosition("Dominik", num1);
        displayHighScorePosition("Brett", num2);
        displayHighScorePosition("Eric", num3);
        displayHighScorePosition("Pickle", num4);
        displayHighScorePosition("DICKLE", num5);
        displayHighScorePosition("CockBun", num6);
        //        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted + bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//        This is the inefficient way due to remaking new variables and such but the values are at least permenantely stored and there is no duplicant code!!
//        boolean newGameOver = true;
//        int secondScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGameOver) {
//            int finalScore = (secondScore + (newLevelCompleted + newBonus));
//            System.out.println("Your final score was " + finalScore);
//        }
//       Since this is indented it will only run the first line of the if statement cause there is no braces around it!
//        if (score == 5000) {
//            System.out.println("The score is equal to 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("We got here //***we when we really shouldn't since the check is true!");
//        }
//        //The better way always is to add the code blocks as it makes the if statements more clearer and easier to read.
//        //This will be executed no matter what even though the curly braces above are missing!
//        System.out.println("This was executed!");
    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {
        if (isGameOver) {
            //Since the final score variable is created in here it cannot be accessed outside of this if statement!!
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;

            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position: " + position + ", on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
//Multiple ways to do things both the methods above and below will woork and do the same thing!
        int position = 4; // assume position 4 will be returned!
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }
}
