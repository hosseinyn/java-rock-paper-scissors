import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to java rock paper scissors \n");

        Scanner input_obj = new Scanner(System.in);

        System.out.println("Select your thing : (rock paper scissors) : ");
        String user_choise = input_obj.nextLine();

        String[] rock_paper_scissors = {"rock" , "paper" , "scissors"};

        boolean is_valid_choise = false;
        for (String rock_paper_scissor : rock_paper_scissors) {
            if (user_choise.contains(rock_paper_scissor)) {
                is_valid_choise = true;
            }
        }

        
        if (is_valid_choise == false) {
            System.out.println("Your choise is not valid !");
            System.exit(0);
        }


        int random_number = (int)(Math.random()*3);

        String computer_choise = rock_paper_scissors[random_number];

        System.out.println("Computer choise : " + computer_choise);

        if (computer_choise.equals(user_choise)) {
            System.out.println("No winner !");
        }

        if ("rock".equals(computer_choise) && "paper".equals(user_choise)) {
            System.out.println("User is winner !");
        } else if ("paper".equals(computer_choise) && "rock".equals(user_choise)) {
            System.out.println("Computer is winner !");
        }

        if ("scissors".equals(computer_choise) && "rock".equals(user_choise)) {
            System.out.println("User is winner !");
        } else if ("rock".equals(computer_choise) && "scissors".equals(user_choise)) {
            System.out.println("Computer is winner !");
        }

        if ("paper".equals(computer_choise) && "scissors".equals(user_choise)) {
            System.out.println("User is winner !");
        } else if ("scissors".equals(computer_choise) && "paper".equals(user_choise)) {
            System.out.println("Computer is winner !");
        }

    }
}