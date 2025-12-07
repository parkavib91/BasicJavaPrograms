public class PrimeNumber{
    public void PrimeNumberMethod(int lowerLimit,int upperLimit){
       PrimeNumberExecute(lowerLimit,upperLimit);
    }
    private static void PrimeNumberExecute(int lowerLimit,int upperLimit){
        int flag = 0;
        System.out.println("The Prime numbers in between entered Limits are:");
        for(int i=lowerLimit;i<=upperLimit;i++){
            for(int j = 2;j<i;j++){
                if(i % j == 0){
                    flag = 0;
                    break;
                }
                else{
                    flag = 1;
                }
            }
           if(flag == 1){
            System.out.println(i);
           }     
        }
    }
 }