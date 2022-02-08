import java.util.Scanner;

public class ComplexCalculator2 {

    public static void main(String[] args) {
        float fnum, snum;
        System.out.println("CHOOSE (+  -  *  /) :\n");
        Scanner a = new Scanner(System.in);
        String op = a.nextLine();
        System.out.println("\nEnter your First Number Here\n");
        fnum = a.nextFloat();
        System.out.println("\nEnter your Second Number Here\n");
        snum = a.nextFloat();
        switch (op) {
            case "+":
                System.out.println("\n\n");
                System.out.println("Results is = " + (fnum + snum));
                break;
            case "-":
                System.out.println("\n\n");
                float result = fnum - snum;
                float subs = Math.abs(result);
                System.out.println("Results is = " + subs);
                break;
            case "*":
                System.out.println("\n\n");
                System.out.println("Results is = " + (fnum * snum));
                break;
            case "/":
                System.out.println("\n\n");
                System.out.println("Results is = " + (fnum / snum));
                break;
            default:
                System.out.println("Wrong operation!");
                return;
        }

    }
}