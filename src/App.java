import java.util.Scanner;
public class App {

        public static void main(String[] args) {
        ExecuteProgram();
    }

    private static void ExecuteProgram(){
        PrintDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ArithmeticOperationExecute(scanner);
                break;

            case 2:
                OddOrEvenCalculation(scanner);
                break;

            case 3:
                LargestNumberCalculation(scanner);
                break;

            case 4:
                PalindromeCalculation(scanner);
                break;
                
            case 5:
                LeapYearCalculation(scanner);
                break;

            case 6:
                PrimeNumberCalculation(scanner);
                break;  

            case 7:
                BinaryStringExecution(scanner);
                break;
                
            default:
                System.out.println("Enter the correct choice");
                break;
        }
        scanner.close();
    }

    private  static void PrintDetails(){
        System.out.println("1. ArithmeticOperation");
        System.out.println("2. OddOrEven");
        System.out.println("3. LargestNumber");
        System.out.println("4. Palindrome");
        System.out.println("5. Leap year");
        System.out.println("6. PrimeNumber");
        System.out.println("7. BinaryString");
        System.out.println("8. LcmGcd");
    }
    private static void OddOrEvenCalculation(Scanner scanner){
        System.out.println("Enter the number for checking odd or even");
        int num = scanner.nextInt();
        OddOrEven oddOrEven = new  OddOrEven();
        oddOrEven.OddOrEvenMethod(num);
    }
    private  static void LargestNumberCalculation(Scanner scanner){
        System.out.println("Enter the First number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter the Third number");
        int num3 = scanner.nextInt();
        LargestNumber largestNumber = new LargestNumber();
        largestNumber.LargestNumberMethod(num1,num2,num3); 
    }
    private static void PalindromeCalculation(Scanner scanner){
        System.out.println("Enter the number");
        int num = scanner.nextInt();       
        Palindrome palindrome = new Palindrome();
        palindrome.PalindromeMethod(num);     
    }
    private static void LeapYearCalculation(Scanner scanner){
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        LeapYear leapYear = new LeapYear();
        leapYear.LeapYearMethod(year);
    }
    private static void PrimeNumberCalculation(Scanner scanner){
        System.out.println("Enter the lowerLimit");
        int lowerLimit = scanner.nextInt();
        System.out.println("Enter the upperLimit");
        int upperLimit = scanner.nextInt();
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.PrimeNumberMethod(lowerLimit,upperLimit);
    }
    private static void BinaryStringExecution(Scanner scanner){
        System.out.println("Enter the x value");
        String x = scanner.next();
        System.out.println("Enter the y value");
        String y = scanner.next();
        BinaryString binaryString = new BinaryString();
        binaryString.BinaryStringMethod(x,y);
    }

    private static void ArithmeticOperationExecute(Scanner scanner){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter the First number ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter your choice for ArithmeticOperation :");
        int choice = scanner.nextInt();
        ArithmeticOperation arithmeticoperation = new ArithmeticOperation();
        arithmeticoperation.ArithmeticOperationMetthod(a,b,choice); 
    }
}