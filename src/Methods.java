import java.util.concurrent.ThreadLocalRandom;

public class Methods {

    static int cntWrong = 0;
    static int cntRight = 0;

    static int cntSkip = 0;


    public static void printScore(){
        System.out.println("############\n#Your Score!\n#RIGHT: " + cntRight + "\n#WRONG: " +cntWrong + "\n#SKIPPED: " + cntSkip + "\n############");
        if (cntWrong > cntRight){
            System.out.println("You can do better");
        }else if (cntRight > cntWrong) {
            System.out.println("Daamnn boi, u r cool");
        }else if (cntWrong == cntRight){
            System.out.println("Meh...");
        }
        System.out.println("\n\n");
    }

    public static int getRandomInRange(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static void printHelp(){
        System.out.println("\n«exit» - exit program\n" +
                "«score» - see my score\n" +
                "«level» - change level\n" +
                "«skip» - skip problem\n");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
