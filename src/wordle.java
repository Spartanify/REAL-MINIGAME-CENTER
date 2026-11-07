import java.util.Scanner;

public class wordle {
    public static final String GREEN = "\033[42;30m";
    private static final String YELLOW = "\033[43;30m";
    private static final String GRAY = "\033[100;97m";
    private static final String RESET = "\033[0m";



    public static void main(String[] args) {
        Scanner wordleScanner = new Scanner(System.in);
        play(wordleScanner);
        wordleScanner.close();
    }


    public static void play(Scanner wordleScanner) {
       
        String[] words = {"apple", "grape", "peach", "mango", "berry", "lemon", "melon", "plums", "guava"};
        
        int randomNumber = (int) (Math.random() * words.length);
        String secretWord = words[randomNumber];
        int guessesLeft = 6;
        boolean won = false;


        
        System.out.println("Guess the 5 letter word in 6 tries. ");
        System.out.println("Green = The correct letter positioning. ");
        System.out.println("Yellow = correct letter, wrong position. ");
        System.out.println("Gray = letter not in the word. ");


        while (guessesLeft > 0 && !won) {
            System.out.print("Enter your guess: ");
            String guess = wordleScanner.nextLine().trim().toUpperCase();

            if (guess.length() != 5) {
                System.out.println("Enter a 5 letter word !!!");

            } else{
                guessesLeft--;


                for (int i = 0; i < 5; i++) {
                    char letter = guess.charAt(i);

                    if (letter == secretWord.charAt(i)) {
                        System.out.print(GREEN + " " + letter + " " + RESET);
                    }else if (secretWord.indexOf(letter) >=0) {
                        System.out.print(YELLOW + " " + letter + " " + RESET);
                    } else {
                        System.out.print(GRAY + " " + letter + " " + RESET);

                    }

                    }
                }
        
            System.out.println();
            if (guess.equals(secretWord.toUpperCase())) {
                System.out.println("You have guessed the word correctly! The word was: " + secretWord);
                won = true;
            }
            System.out.println("Guesses left: " + guessesLeft);
        }

        if (!won) {
            System.out.println("Out of guesses! The word was " + secretWord + ".");
            System.out.println("1: Play Wordle again");
            System.out.println("2: Go back to the menu");
            System.out.print("Enter your choice: ");

            int yourChoice = wordleScanner.nextInt();
            wordleScanner.nextLine();

            if (yourChoice == 1) {
                play(wordleScanner);
            }
        }

        return;
    }
        
}

           
        
    

//6 attempts at guessing a 5 letter word
// color clues each index of the guess
// needs list of words
