
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


//Ментальная арифметика, mental math
public class Main {
    Methods m = new Methods();
    ProblemGenerator p = new ProblemGenerator();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;


        System.out.println("*****************[MetaMath 1.0]*****************");
        System.out.println("improve your mental math level by solving simple problems!");
        Methods.printHelp();
        System.out.println("by t3kNick 2023");
        System.out.println("************************************************");

        System.out.println(ProblemGenerator.generateProblem(Methods.getRandomInRange(0, 3)));
        while (true) {
            input = in.nextLine();

            if (input.equals("score")) {
                Methods.printScore();
            }else if (input.equals("level")){
                System.out.println("Enter level (1-100)");
                int t = in.nextInt();
                if ((t >= 1) & (t <= 100)) {
                    ProblemGenerator.k = t;
                    System.out.println("#Done! Level = " + ProblemGenerator.k + "\n\n");
                }else{
                    System.out.println("#Errror! Level can be only 1-100\n\n");
                }
            }else if(input.equals("exit")) {
                Methods.printScore();
                System.out.println("\n\nQuit...");
                break;
            }else if (input.equals("help")){
                Methods.printHelp();
            }else if (Methods.isNumeric(input)){
                if (Integer.parseInt(input) == ProblemGenerator.b) {
                    System.out.println("Right!");
                    Methods.cntRight += 1;
                    System.out.println(ProblemGenerator.generateProblem(Methods.getRandomInRange(0, 3)));
                }else{
                    System.out.println("Wrong! Answer was: " + ProblemGenerator.b + "\n");
                    Methods.cntWrong += 1;
                    System.out.println(ProblemGenerator.generateProblem(Methods.getRandomInRange(0, 3)));
                }
            }else if (input.equals("skip")) {
                Methods.cntSkip += 1;
                System.out.println(ProblemGenerator.generateProblem(Methods.getRandomInRange(0, 3)));
            }else if (input.equals("cheat")){
                System.out.println("right answer is:" + ProblemGenerator.b);
            }else{
                System.out.println("Unknown command! Type 'help' to help");
            }

        }
    }
}