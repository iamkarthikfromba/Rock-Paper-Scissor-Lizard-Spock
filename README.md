/** RockPaperScissorsLizardSpock Game Documentation **/

 * The `Game` class represents a simple Rock, Paper, Scissors, Lizard, Spock game implemented using Java Swing.
 * The game includes a graphical user interface with labels, icons, and buttons to facilitate user interaction.
 *
 * Main Features:
 * - Player can choose from Rock, Paper, Scissors, Lizard, or Spock by clicking on corresponding labels.
 * - The computer randomly selects one of the options.
 * - The game logic determines the winner based on the choices made by the player and the computer.
 * - Scores are displayed for both the player and the computer.
 * - The graphical user interface includes reset functionality to clear the scores.
 *
 * Structure and Components:
 * - The game is implemented as a Java Swing application with the `Game` class extending `JFrame`.
 * - Labels are used to display the computer's choice, game results, and the scores of the player and computer.
 * - Icons are used to represent Rock, Paper, Scissors, Lizard, and Spock choices.
 * - Mouse listeners are employed to detect user clicks on the options.
 * - A reset button allows users to reset the scores to zero.
 *
 * Methods:
 * - `setComputerChoice()`: Initializes the label to display the computer's choice.
 * - `setScoreResult()`: Initializes labels to display player and computer scores, and game results.
 * - `setrocklabel()`, `setpaperlabel()`, `setscissorlabel()`, `setlizardlabel()`, `setspocklabel()`:
 *    Initialize labels for Rock, Paper, Scissors, Lizard, and Spock options with corresponding icons.
 * - `calculate(String player)`: Calculates the game result based on the player's choice and the computer's random choice.
 * - `updateScore(String player, String computer)`: Updates scores and displays the result based on game logic.
 * - `titleLabel()`: Initializes and displays the title label for the game.
 * - `load_images()`: Loads images for Rock, Paper, Scissors, Lizard, and Spock options.
 * - `createField()`: Configures the main frame properties and makes it visible.
 * - `setResetButton()`: Initializes and adds a reset button to the game interface.
 * - `resetScores()`: Resets player and computer scores, clears the result and computer's choice displays.
 * - `main(String args[])`: Entry point of the application; initializes and sets up the game interface.

 * Rules for the Rock, Paper, Scissors, Lizard, Spock game:
 *
 * 1. The game is an extension of the classic Rock, Paper, Scissors game and includes two additional choices: Lizard and Spock.
 *
 * 2. Players can choose one of the following options:
 *    - Rock
 *    - Paper
 *    - Scissors
 *    - Lizard
 *    - Spock
 *
 * 3. The computer randomly selects one of the options as its choice.
 *
 * 4. The game follows the following win/lose scenarios:
 *    - Rock crushes Scissors and crushes Lizard
 *    - Paper covers Rock and disproves Spock
 *    - Scissors cut Paper and decapitate Lizard
 *    - Lizard eats Paper and poisons Spock
 *    - Spock vaporizes Rock and crushes Scissors
 *
 * 5. If both the player and computer choose the same option, the result is a draw.
 *
 * 6. The game keeps track of scores for the player and computer.
 *
 * 7. The player can reset the scores using the "Reset Scores" button.
 *
 * 8. The game displays the result of each round, the computer's choice, and the current scores.
 *
 * 9. The game continues until the player decides to reset the scores or close the application.
 *
 * 10. Have fun playing and may the best choice win!
