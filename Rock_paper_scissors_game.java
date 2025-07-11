package com.java;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors_game {
    public static void main(String []Args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int Cscore = 0;
        int Pscore = 0;

        System.out.println("Welcome to Rock-Paper-Scissors Game!");

        for (int round = 1; round <= 5; round++) {

            //GENERATING A RANDOM NUMBER
            int randomNum = rand.nextInt(3);  // Gives 0, 1, or 2
            // asumming      0 = Rock, 1 = paper, 2= scissors

// COMPUTER CHOICE
            String[] choices = {"Rock", "Paper", "Scissor"};
            String computerChoice = choices[randomNum];

            String a = "Rock";
            String b = "Scissor";
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
            if (input.equals("a") && randomNum == 0) {
                System.out.println("Tie");
            } else if (input.equals("a") && randomNum == 1) {
                System.out.println("lose");
                Cscore++;
            } else if (input.equals("a") && randomNum == 2) {
                System.out.println("win");
                Pscore++;
            }
//SCISSCOR AS INPUT

            else if (input.equals("b") && randomNum == 0) {
                System.out.println("Lose");
                Cscore++;
            } else if (input.equals("b") && randomNum == 1) {
                System.out.println("Win");
                Pscore++;;
            } else if (input.equals("b") && randomNum == 2) {
                System.out.println("Tie");

            }

// PAPER AS INPUT

            else if (input.equals("c") && randomNum == 0) {
                System.out.println("Win");
                Pscore++;
            } else if (input.equals("c") && randomNum == 1) {
                System.out.println("Tie");

            } else if (input.equals("c") && randomNum == 2) {
                System.out.println("Lose");
                Cscore++;
            } else {
                System.out.println("Invalid response please enter a b c d");
                round--; // don't count invalid round
            }
        }

        // Final result
        System.out.println("\n--- Game Over ---");
        if (Pscore > Cscore) {
            System.out.println("🎉 You win the game!");
        } else if (Cscore > Pscore) {
            System.out.println("😞 You lose the game!");
        } else {
            System.out.println("🤝 It's a tie!");
        }

        System.out.println("Final Score - You: " + Pscore + " | Computer: " + Cscore);
    }




    }

