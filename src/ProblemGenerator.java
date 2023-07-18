public class ProblemGenerator {
    //Generates problem by id
    //id's: 0 = '+'    1 = '-'    2 = '/'    3 = '*'

    static int a;
    static int b = 0;
    static int c;
    static int k = 5; // Problem range factor

    private static String rtrn = "";

    // a (+-*/) b = c
    public static String generateProblem(int id){

        if (id == 0){           // +
            a = Methods.getRandomInRange(0,10*k);
            b = Methods.getRandomInRange(0,10*k);
            c = a + b;
            rtrn = ("      " + a + " + ? = " + c);
        }else if (id == 1){     // -
            a = Methods.getRandomInRange(0,10*k);
            b = Methods.getRandomInRange(0,10*k);
            c = a - b;
            rtrn = ("      " + a + " - ? = " + c);
        }else if (id == 2){     // /
            b = Methods.getRandomInRange(0,10*k);
            c = Methods.getRandomInRange(0,10*k);
            a = b * c;
            rtrn = ("      " + a + " : ? = " + c);

        }else if (id == 3) {     // *
            a = Methods.getRandomInRange(0,10*k);
            b = Methods.getRandomInRange(0,10*k);
            c = a * b;
            rtrn = ("      " + a + " * ? = " + c);
        }
        
        return rtrn;
    }

    public static String returnLastProblem(){
        return(rtrn);
    }
}
