 public class BinaryString {
    public void BinaryStringMethod(String x,String y){
        Add_BinaryString(x, y);
    }
    private static void Add_BinaryString(String x,String y){
        int num1 = Integer.parseInt(x);
        int num2 = Integer.parseInt(y);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
    }
  } 