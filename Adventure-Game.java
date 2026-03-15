import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖

        Scanner scan = new Scanner(System.in);
        String playAgain = "y";

        while (playAgain.equals("y")) {

            // print out the choices and scenario
            System.out.println("You have been transported to the year 3433");
            System.out.println("You wake up and notice that you're no longer on Earth.");
            System.out.println("Gravity feels different. It's dark outside and as you stand up, you realise you're outside... a house?");

            System.out.println("");
            System.out.println("Selection one: [a] Walk towards the house or [b] call out to the house");

            // user input
            System.out.print("What is your choice? ");
            String choice = scan.nextLine();

            // option a 
            if (choice.equals("a")) {
                System.out.println("");
                System.out.println("You approach the house and walk up the stairs to the font door ");
                System.out.println("You're about to knock when suddenly you notice the lights inside the house turn on ");
                System.out.println("");
                System.out.println("Selection one: [a] Hide or [b] confront whatever's coming");

                // user input
                System.out.print("What is your choice? ");
                String choice2 = scan.nextLine();
            

            
                if (choice2.equals("a")) {
                    System.out.println("");
                    System.out.println("You hide and watch as a strange alien-like individual walk out with what appears to be a weird looking gun");
                    System.out.println("You hide and cower in fear, you decide to check if the alien is still there");
                    System.out.println("To your surprise, he is not. You then feel a chill behind your neck");
                    System.out.println("You turn around as the alien grabs you and sucks your soul out. ");
                    System.out.println("You died.");
                    System.out.println("The End.");                   
        
                }

                else if (choice2.equals("b")) {
                    System.out.println("");
                    System.out.println("You confront the alien, you rush at it, tackling it onto the ground");
                    System.out.println("You take its stuff, and eventually its life. You end up taking its house and making it your home");
                    System.out.println("The End.");
                }

            }

            // option b
            if (choice.equals("b")) {
                System.out.println("");
                System.out.println("You confront whatever is coming, you hear footsteps walk towards the  door");
                System.out.println("You see a strange figure appear at the door, the figure looks alien like");
                System.out.println("The creature calls out 'Who are you? What business do you have here?'");
                System.out.println("");
                System.out.println("Selection one: [a] 'I am here to seek refuge, I don't know where i am' or [b] Run away");

                // user input    
                System.out.println("What is your choice? ");
                String choice2 = scan.nextLine();

                if (choice2.equals("a")) {
                    System.out.println("");
                    System.out.println("The alien takes you in and as time goes on, you become his apprentice in his underground laboratory");
                    System.out.println("You live a good and fulfilling life.");
                    System.out.println("The End.");
                }

                else if (choice2.equals("b")) {
                    System.out.println("");
                    System.out.println("You run away from this horrid creature");
                    System.out.println("As you move your feet, you notice you've been grabbed by something");
                    System.out.println("You are pulled into the aliens grasps and taken into its underground laboratory");
                    System.out.println("You live out the rest of your life as a guinea pig for its experiments");
                    System.out.println("The End.");
                }

                System.out.println("The End.");

            }

            System.out.println("");
            System.out.print("Play again? [y / n] ");
            playAgain = scan.nextLine();
            System.out.println("/--------------------------------------------------------/");
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Thanks for playing! We hope to see you again soon!");
        scan.close();

    }
}