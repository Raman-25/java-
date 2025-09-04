import java.util.Scanner;
import java.util.Random;
class Game {
        private int no_of_guess;
        private int random_number;
        private int player_input;

        public Game() {
            Random rand = new Random();
            random_number = rand.nextInt(100) ;
            no_of_guess =0;
        }
        public void user_input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A Number in (1-100): ");
            player_input = sc.nextInt();
            no_of_guess++;
        }
        public boolean is_input_correct(){
            if(player_input==random_number){
                System.out.println("You guess the Number in " + no_of_guess + " Guess");
                return true;
            }
            else if (player_input>random_number) {
                System.out.println("Too high...");
            }
            else{
                System.out.println("Too low...");
            }
            return false;
        }
        public int getno_of_guess(){
            return no_of_guess;
            }
        public void setno_of_guess(int n){
            n = no_of_guess;
        }
    }
public class Guess_the_Number_game{
    public static void main(String[] args) {
        Game newgame =  new Game();
        boolean iscoorect = false;

        while(!iscoorect){
            newgame.user_input();
            iscoorect=newgame.is_input_correct();
        }
    }
}