public class Palindrome {
   public void PalindromeMethod(int num){
      PalindromeCheck(num);
   }
    private static void PalindromeCheck(int num){
        int remainder = 0;
        int ReversedNum = 0;
        int OriginalNum = num;
        while(num != 0){
            remainder = num % 10;
            ReversedNum = ReversedNum * 10 + remainder;
            num /=10;
        }
        if(OriginalNum == ReversedNum){
            System.out.println(OriginalNum + "is Palindrome number");
        }
        else{
            System.out.println(OriginalNum + "is not Palindrome number.");
        }
    }
}