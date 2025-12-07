public class LargestNumber {
    public void LargestNumberMethod(int num1,int num2,int num3){
        LargestNumberComparison(num1, num2, num3);
    }
    private static void LargestNumberComparison(int num1,int num2,int num3){
        if(num1>num2){
            System.out.println("Largest number is " +num1);
        }
        else if(num2>num3){
            System.out.println("Largest number is " +num2);
        }
        else if(num1>num3){
            System.out.println("Largest number is " +num1); 
        }    
    }
} 