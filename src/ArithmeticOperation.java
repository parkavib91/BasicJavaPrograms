public class ArithmeticOperation {
    public void ArithmeticOperationMetthod(int a,int b,int choice){
        ArithmeticCalculation(a,b,choice);      
    }
    private static void ArithmeticCalculation(int a, int b, int choice){
        switch (choice) {
            case 1:
                int sum = a + b;
                System.out.println("Sum of 2 numbers is" +sum);
                break;
        
            case 2:
                int result = a - b;
                System.out.println("Subtraction of these numbers are:" +result);
                break;

            case 3:
                int product = a * b;
                System.out.println("Multiplication of these numbers are:" +product);
                break;

            case 4:
                int quotient = a/b;
                System.out.println("Division of these numbers are:" +quotient);
                break;
        
            default:
                System.out.println("Enter the correct choice");
                break;
        }
    }
    
}
