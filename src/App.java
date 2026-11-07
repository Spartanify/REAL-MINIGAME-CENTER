import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        
        while (running) {
        System.out.println("====Mini Game Center====");
        System.out.println("1: Wordle");
        System.out.println("2: Black Jack");
        System.out.println("3: Coinflip");
        
        
        
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        

        if (choice == 1){
        wordle.play(input);
    } else if (choice == 2){
        System.out.println("Black Jack");
    } else if (choice == 3){
        coinflip(input);
    } else {
        System.out.println("Invalid choice. Please try again.");
        }
    }
    
        }
    
    
    
    public static void coinflip(Scanner input){
    boolean playAgain = true;

    while (playAgain) {
    // Scanner inp = new Scanner(System.in);
    


    System.out.println("COINFLIP");
    System.out.println("1: Heads");
    System.out.println("2: Tails");
    System.out.println("Choose heads or tails: ");

    int userChoice = input.nextInt();

    
    



    int result = (int)(Math.random()*2) + 1;

    if (result == 1){
        System.out.println("Heads!");
    } else {
        System.out.println("Tails!");
}

    if(userChoice == result){
        
        System.out.println("You win!");
    } else {
        System.out.println("You lose!");
    }
    // heads or tails
    // heads or tails again

            System.out.println("1: Play Coinflip again");
            System.out.println("2: Back to menu");
            System.out.print("Enter your choice: ");

            int replayChoice = input.nextInt();
            input.nextLine();

            if (replayChoice == 2) {
                playAgain = false;
            }

    }

}
}
