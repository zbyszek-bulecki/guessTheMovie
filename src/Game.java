import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Game {

    public static void main(String [] args) throws Exception {


        // Scanner scanner = new Scanner(System.in); // User input Scanner constructor.

        File file = new File("movie-titles.txt");
        Scanner scanner1 = new Scanner(file);  // Movie titles file ile read constructor.

        String[] titles = new String[100];

        int i=0;

        while (scanner1.hasNextLine()) { // Loop for scanning the file and loading each line into an array.

            String line = scanner1.nextLine();
            // System.out.println(line);
            titles[i] = line;
            i++;
        }
        int arrayLength = titles.length; // Checks how many titles are in the array.
        int index = (int) (Math.random() * i); // Selects a random movie title from the array.
        // System.out.println(titles[index]); // And prints it out.

        // int underscores = titles[index].length(); // Checks how many underscores are needed to display a masked movie title.

        char titleLetters[] = titles[index].toCharArray(); // Converts the title into a character array.

        char titleLettersMock[] = titles[index].toCharArray(); // Converts the title into a 2nd character array.


        int titleLength = titleLettersMock.length; // Checks the title's length.
        for (i = 0; i < titleLength; i++) { // Converts the movie title to '*' for letters and '_' for whitespaces.
            if (titleLetters[i]==' ') titleLettersMock[i] = '_';
            else {
                titleLettersMock[i] = '*';
            }
        }

        System.out.println("Guess the movie title: " + Arrays.toString(titleLettersMock).replace(",", "")); // Displays the coded movie title.
        System.out.println("Type the letter you want to guess. You have 10 attempts.");

        Scanner scanner2 = new Scanner(System.in); // User keyboard input reader constructor.

        String guessedLetters = ""; // Variable storing guessed letters.

        int j = 10;
        while (j > 0) { // Loop for the 10 attempts.
            String userGuess = scanner2.nextLine(); // Reading user input/
            char letter = userGuess.charAt(0); // Converting user input from String to a char.

            boolean guess = true; // Variable storing if user guess was correct.

            int p = 0;

            for (int k = 0; k < titleLength; k++) {// Loop for comparing user input with the movie title.
                if (titleLetters[k] == letter) {
                    titleLettersMock[k] = letter;
                    p++;
                }// Condition for comparing user input character to each character stored in the array.
            } // End of loop for comparing user input with the movie title.

            if (p == 0) guess = false;
            guessedLetters = guessedLetters + " " + letter; // Stores all the letters guessed so far.

            boolean hasWon = true; // Variable storing if user has won.
            for (int l = 0; l < titleLength; l++) { // Loop if there are any '*' remaining.

                if (titleLettersMock[l] == '*') {
                    hasWon = false;
                }
            } // End loop if there are any '*' remaining.

            if (hasWon) { // Checking win condition.
                System.out.println("You've won!! Congratulations!");
                break;
            }

            if (!guess) {
                j--;
                System.out.println("Wrong letter, sorry! You have " + (j) + " guesses left. Try again.");
            } else {
                System.out.println("You got one correct!");
            }

            System.out.println("The word is " + Arrays.toString(titleLettersMock).replace(",", ""));
            System.out.println("Your guessed letters are: " + guessedLetters + ". You have " + (j) + " guesses left. Try again.");

            if (j == 0) {
                System.out.println("You've lost!! Good luck next time.");
                break;
            } // End of if checking if the user used all the attempts.

        } // End of loop for 10 attempts.


        } // End of main method

    } // End of Game class
