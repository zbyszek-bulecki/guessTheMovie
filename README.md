# guessTheMovie 

As part of my preparation for the Java bootcamp I wrote this simple application for playing *Guess The Movie*. This exercise is part of the OOP course from Udacity.

The Game reads a text file with movie titles and randomly chooses one for the player to guess. The player has 10 chances
to guess the movie title. Whitespaces are marked with `_` and letters with `*`.

The logic reads each string from the text file and maps it onto an array. The software also creates a mock array with `_` and `*` characters to visually
represent the original string from the text file. The app reads the player input from the keaboard and compares each character in the array with it.
If a letter matches the input in the array containing the word, the software modifies the array with mock characters to reflect the guessed ones.
It also keeps track of the guessed characters by displaying them on the screen. If there are no more characters to be modified, the player wins.
If the player runs out of attempts without guessing the word (s)he looses.

*The code is imperfect to say the least.* Due to time constraints I've decided not to use any OOP concepts and I sticked to with what I felt confident with
at the time of writing the program. A natural next step is for me to refactor the code in the near future to use OOP.
I think I could separarate the game logic from the functions and improve the readibility and code maintenance.
