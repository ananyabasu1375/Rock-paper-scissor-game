import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        String rpsString[] = {"rock", "paper", "scissor"};
        String compMove = rpsString[new Random().nextInt(rpsString.length)];

        Scanner sc = new Scanner(System.in);
        String userMove;
        while(true){
            System.out.println("            =========================================");
            System.out.println("            Enter your move (Rock, Paper or Scissor))");
            System.out.println("            =========================================");
            System.out.print("              ");
            userMove = sc.nextLine();

            if(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissor") )
                break;
                System.out.println(userMove + "is not a valid choice. Enter rock or paper or scissor");
        }

        

        System.out.println("The computer chose : "+compMove);

        if(userMove.equals(compMove))
            System.out.println("Oops! That's a Tie!");

        else if(userMove.equals("rock")){
            if(compMove.equals("paper")){
                System.out.println("            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("            Sorry! you lost!\n            Because computer chose paper. ");
                System.out.println("            Oops! your rock is covered by the paper!");
                System.out.println("            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }

            else{
                System.out.println("            ============================================================");
                System.out.println("            Congratulations! you won!!\n           Because computer chose scissor. ");
                System.out.println("            You broke computer's scissor with your rock!");
                System.out.println("            ============================================================");
            }
        }

        else if(userMove.equals("paper")){
            if(compMove.equals("rock")){
                System.out.println("            ============================================================");
                System.out.println("            Congratulations! you won!!\n           Because computer chose rock. ");
                System.out.println("            You covered computer's rock with your paper!");
                System.out.println("            ============================================================");
            }
            else{
                System.out.println("            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("            Sorry! You lost!\n            Because computer chose scissor. ");
                System.out.println("            Your paper is cut with the scissor!");
                System.out.println("            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }

        else if(userMove.equals("scissor")){
            if(compMove.equals("paper")){
                System.out.println("            ============================================================");
                System.out.println("            Congratulations! you won!!\n             Because computer chose paper. ");
                System.out.println("            You cut computer's paper with your scissor!");
                System.out.println("            ============================================================");
            }

            else{
                System.out.println("            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("            Sorry! You lost!\n               Because computer chose rock.");
                System.out.println("            Your scissor has been broken by the rock!");
                System.out.println("            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }
    }
    }
