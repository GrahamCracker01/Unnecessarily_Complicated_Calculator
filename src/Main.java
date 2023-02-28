import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner scan = new Scanner(System.in);

    static ArrayList <CalcOp> Operations = new ArrayList<>();
    public static int totalOpCount, loopCount;
    static boolean boolStop = false;


    public static void doStuff() {
        setFirstNumber();
        setSecondNumber();
        viewCheck();
    }

    public static void setFirstNumber (){
        System.out.println("What is the first number?");
        int intInput = Integer.parseInt(scan.nextLine());
        Operations.get(loopCount).setFlt1(intInput);
    }

    public static void setSecondNumber (){
        System.out.println("What is the second number?");
        int intInput = Integer.parseInt(scan.nextLine());
        Operations.get(loopCount).setFlt2(intInput);
    }

    public static void viewCheck() {
        System.out.print("Would you like to see your answer now? \nYes or No:");
        String yesOrNo = scan.nextLine();
        if (yesOrNo.equals("Yes") || yesOrNo.equals("yes")) {
            System.out.println(Operations.get(loopCount).toString());
        }
        else if (yesOrNo.equals("No") || yesOrNo.equals("no")) {
            System.out.println("You can view previous calculations from the main menu.");
        }
        else {
            System.out.println("Invalid response. You can view previous calculations from the main menu.");
        }
    }

    public static void rushMode() {
        do {
            System.out.println("----------------\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Previous calculations\n6) Slow mode\n7) Quit");
            int intInput = Integer.parseInt(scan.nextLine());
            switch (intInput) {
                case 1:
                    //addition
                    Addition newAddition = new Addition();
                    Operations.add(newAddition);
                    doStuff();
                    break;
                case 2:
                    //subtraction
                    Subtraction newSubtraction = new Subtraction();
                    Operations.add(newSubtraction);
                    doStuff();
                    break;
                case 3:
                    //multiplication
                    Multiplication newMultiplication = new Multiplication();
                    Operations.add(newMultiplication);
                    doStuff();
                    break;
                case 4:
                    //division
                    Division newDivision = new Division();
                    Operations.add(newDivision);
                    doStuff();
                    break;
                case 5:
                    //view all previous operations
                    System.out.println("\nTotal calculations: " + totalOpCount + ". List:");
                    for (CalcOp operation : Operations) {
                        System.out.println(operation.toString());
                    }
                    break;
                case 6:
                    //slow mode
                    return;
                case 7:
                    //quit
                    boolStop = true;
                    break;
                default:
                    System.out.println("\nPlease select a valid option");
            }
            loopCount++;
        }while (!boolStop);
    }

    public static void main(String[] args) {

        do {
            System.out.println("----------------\nWhat operation would you like to perform?\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) View previous calculations\n6) In a hurry?\n7) Quit");
            int intInput = Integer.parseInt(scan.nextLine());
                switch (intInput) {
                    case 1:
                        //addition
                        Addition newAddition = new Addition();
                        Operations.add(newAddition);
                        doStuff();
                        break;
                    case 2:
                        //subtraction
                        Subtraction newSubtraction = new Subtraction();
                        Operations.add(newSubtraction);
                        doStuff();
                        break;
                    case 3:
                        //multiplication
                        Multiplication newMultiplication = new Multiplication();
                        Operations.add(newMultiplication);
                        doStuff();
                        break;
                    case 4:
                        //division
                        Division newDivision = new Division();
                        Operations.add(newDivision);
                        doStuff();
                        break;
                    case 5:
                        //view all previous operations
                        System.out.println("\nYou have made " + totalOpCount + " total calculations. Here's the a list of them all:");
                        for (CalcOp operation : Operations) {
                            System.out.println(operation.toString());
                        }
                        break;
                    case 6:
                        //rush mode
                        rushMode();
                        break;
                    case 7:
                        //quit
                        boolStop = true;
                        break;
                    default:
                        System.out.println("\nPlease select a valid option");
                }
                loopCount++;
        }while (!boolStop);
    }
}
