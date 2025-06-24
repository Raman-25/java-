package com.java;
import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors_game {
    public static void main(String []Args){


//GENERATING A RANDOM NUMBER
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNum = rand.nextInt(3);  // Gives 0, 1, or 2
        // asumming      0 = Rock, 1 = paper, 2= scissors
// COMPUTER CHOICE
        String[] choices = {"Rock", "Paper", "Scissor"};
        String computerChoice = choices[randomNum];


        String a = "Rock";
        String b  = "Scissor";
        String c = "Paper";
// INSTRUCTIONS
        System.out.println("Rock - a");
        System.out.println("Scissor - b");
        System.out.println("Paper - c");

// USER INPUT
        String input = sc.nextLine();
// SHOWING COMPUTER CHOICE
        System.out.println("Computer chose: " + computerChoice);

// ROCK AS INPUT
        if (input.equals("a") && randomNum==0 ){
            System.out.println("Tie");
        }
        else if (input.equals("a") && randomNum==1){
            System.out.println("lose");
        }
        else if (input.equals("a") && randomNum==2){
            System.out.println("win");
        }
//SCISSCOR AS INPUT

        else if (input.equals("b") && randomNum==0 ){
            System.out.println("Lose");
        }
        else if (input.equals("b") && randomNum==1){
            System.out.println("Win");
        }
        else if (input.equals("b") && randomNum==2){
            System.out.println("Tie");
        }

// PAPER AS INPUT

        else if (input.equals("c") && randomNum==0 ){
            System.out.println("Win");
        }
        else if (input.equals("c") && randomNum==1){
            System.out.println("Tie");
        }
        else if (input.equals("c") && randomNum==2){
            System.out.println("Lose");
        }
        else {
            System.out.println("Invalid response please enter a b c d");
        }

}

    
}
